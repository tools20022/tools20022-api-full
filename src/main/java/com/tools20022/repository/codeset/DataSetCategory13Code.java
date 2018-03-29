/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DataSetCategory13Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Maintenance service to delegate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#AcquirerProtocolParameters
 * DataSetCategory13Code.AcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#ApplicationParameters
 * DataSetCategory13Code.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#ApplicationParametersSubsetCreation
 * DataSetCategory13Code.ApplicationParametersSubsetCreation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#KeyDownload
 * DataSetCategory13Code.KeyDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#KeyManagement
 * DataSetCategory13Code.KeyManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#Reporting
 * DataSetCategory13Code.Reporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#SoftwareModule
 * DataSetCategory13Code.SoftwareModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#TMSProtocolParameters
 * DataSetCategory13Code.TMSProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#MerchantParameters
 * DataSetCategory13Code.MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#TerminalParameters
 * DataSetCategory13Code.TerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#CertificateParameters
 * DataSetCategory13Code.CertificateParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#SaleComponent
 * DataSetCategory13Code.SaleComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code#SaleToPOIProtocolParameters
 * DataSetCategory13Code.SaleToPOIProtocolParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
 * DataSetCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetCategory13Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Maintenance service to delegate."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
 * DataSetCategory11Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataSetCategory13Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#AcquirerProtocolParameters
	 * DataSetCategory11Code.AcquirerProtocolParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code AcquirerProtocolParameters = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProtocolParameters";
			previousVersion_lazy = () -> DataSetCategory11Code.AcquirerProtocolParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.AcquirerProtocolParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#ApplicationParameters
	 * DataSetCategory11Code.ApplicationParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code ApplicationParameters = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			previousVersion_lazy = () -> DataSetCategory11Code.ApplicationParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.ApplicationParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParametersSubsetCreation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#ApplicationParametersSubsetCreation
	 * DataSetCategory11Code.ApplicationParametersSubsetCreation}</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code ApplicationParametersSubsetCreation = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParametersSubsetCreation";
			previousVersion_lazy = () -> DataSetCategory11Code.ApplicationParametersSubsetCreation;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.ApplicationParametersSubsetCreation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDownload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#KeyDownload
	 * DataSetCategory11Code.KeyDownload}</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code KeyDownload = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDownload";
			previousVersion_lazy = () -> DataSetCategory11Code.KeyDownload;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.KeyDownload.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#KeyManagement
	 * DataSetCategory11Code.KeyManagement}</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code KeyManagement = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyManagement";
			previousVersion_lazy = () -> DataSetCategory11Code.KeyManagement;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.KeyManagement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#Reporting
	 * DataSetCategory11Code.Reporting}</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code Reporting = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			previousVersion_lazy = () -> DataSetCategory11Code.Reporting;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.Reporting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareModule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#SoftwareModule
	 * DataSetCategory11Code.SoftwareModule}</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code SoftwareModule = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareModule";
			previousVersion_lazy = () -> DataSetCategory11Code.SoftwareModule;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.SoftwareModule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#TMSProtocolParameters
	 * DataSetCategory11Code.TMSProtocolParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code TMSProtocolParameters = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			previousVersion_lazy = () -> DataSetCategory11Code.TMSProtocolParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.TMSProtocolParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#MerchantParameters
	 * DataSetCategory11Code.MerchantParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code MerchantParameters = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			previousVersion_lazy = () -> DataSetCategory11Code.MerchantParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.MerchantParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#TerminalParameters
	 * DataSetCategory11Code.TerminalParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code TerminalParameters = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			previousVersion_lazy = () -> DataSetCategory11Code.TerminalParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.TerminalParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#CertificateParameters
	 * DataSetCategory11Code.CertificateParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code CertificateParameters = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			previousVersion_lazy = () -> DataSetCategory11Code.CertificateParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.CertificateParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleComponent"</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code SaleComponent = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleComponent";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.SaleComponent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
	 * DataSetCategory13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleToPOIProtocolParameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory13Code SaleToPOIProtocolParameters = new DataSetCategory13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleToPOIProtocolParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory13Code.mmObject();
			codeName = DataSetCategoryCode.SaleToPOIProtocolParameters.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DataSetCategory13Code> codesByName = new LinkedHashMap<>();

	protected DataSetCategory13Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetCategory13Code";
				definition = "Maintenance service to delegate.";
				previousVersion_lazy = () -> DataSetCategory11Code.mmObject();
				trace_lazy = () -> DataSetCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory13Code.AcquirerProtocolParameters, com.tools20022.repository.codeset.DataSetCategory13Code.ApplicationParameters,
						com.tools20022.repository.codeset.DataSetCategory13Code.ApplicationParametersSubsetCreation, com.tools20022.repository.codeset.DataSetCategory13Code.KeyDownload,
						com.tools20022.repository.codeset.DataSetCategory13Code.KeyManagement, com.tools20022.repository.codeset.DataSetCategory13Code.Reporting, com.tools20022.repository.codeset.DataSetCategory13Code.SoftwareModule,
						com.tools20022.repository.codeset.DataSetCategory13Code.TMSProtocolParameters, com.tools20022.repository.codeset.DataSetCategory13Code.MerchantParameters,
						com.tools20022.repository.codeset.DataSetCategory13Code.TerminalParameters, com.tools20022.repository.codeset.DataSetCategory13Code.CertificateParameters,
						com.tools20022.repository.codeset.DataSetCategory13Code.SaleComponent, com.tools20022.repository.codeset.DataSetCategory13Code.SaleToPOIProtocolParameters);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcquirerProtocolParameters.getCodeName().get(), AcquirerProtocolParameters);
		codesByName.put(ApplicationParameters.getCodeName().get(), ApplicationParameters);
		codesByName.put(ApplicationParametersSubsetCreation.getCodeName().get(), ApplicationParametersSubsetCreation);
		codesByName.put(KeyDownload.getCodeName().get(), KeyDownload);
		codesByName.put(KeyManagement.getCodeName().get(), KeyManagement);
		codesByName.put(Reporting.getCodeName().get(), Reporting);
		codesByName.put(SoftwareModule.getCodeName().get(), SoftwareModule);
		codesByName.put(TMSProtocolParameters.getCodeName().get(), TMSProtocolParameters);
		codesByName.put(MerchantParameters.getCodeName().get(), MerchantParameters);
		codesByName.put(TerminalParameters.getCodeName().get(), TerminalParameters);
		codesByName.put(CertificateParameters.getCodeName().get(), CertificateParameters);
		codesByName.put(SaleComponent.getCodeName().get(), SaleComponent);
		codesByName.put(SaleToPOIProtocolParameters.getCodeName().get(), SaleToPOIProtocolParameters);
	}

	public static DataSetCategory13Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataSetCategory13Code[] values() {
		DataSetCategory13Code[] values = new DataSetCategory13Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataSetCategory13Code> {
		@Override
		public DataSetCategory13Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataSetCategory13Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}