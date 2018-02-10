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
import com.tools20022.repository.codeset.DataSetCategory11Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#AcquirerProtocolParameters
 * DataSetCategory11Code.AcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#ApplicationParameters
 * DataSetCategory11Code.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#ApplicationParametersSubsetCreation
 * DataSetCategory11Code.ApplicationParametersSubsetCreation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#KeyDownload
 * DataSetCategory11Code.KeyDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#KeyManagement
 * DataSetCategory11Code.KeyManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#Reporting
 * DataSetCategory11Code.Reporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#SoftwareModule
 * DataSetCategory11Code.SoftwareModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#TMSProtocolParameters
 * DataSetCategory11Code.TMSProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#MerchantParameters
 * DataSetCategory11Code.MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#TerminalParameters
 * DataSetCategory11Code.TerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code#CertificateParameters
 * DataSetCategory11Code.CertificateParameters}</li>
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
 * "DataSetCategory11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Maintenance service to delegate."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code
 * DataSetCategory6Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataSetCategory11Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code#AcquirerProtocolParameters
	 * DataSetCategory6Code.AcquirerProtocolParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory11Code AcquirerProtocolParameters = new DataSetCategory11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProtocolParameters";
			previousVersion_lazy = () -> DataSetCategory6Code.AcquirerProtocolParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory11Code.mmObject();
			codeName = DataSetCategoryCode.AcquirerProtocolParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code#ApplicationParameters
	 * DataSetCategory6Code.ApplicationParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory11Code ApplicationParameters = new DataSetCategory11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			previousVersion_lazy = () -> DataSetCategory6Code.ApplicationParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory11Code.mmObject();
			codeName = DataSetCategoryCode.ApplicationParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParametersSubsetCreation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code#ApplicationParametersSubsetCreation
	 * DataSetCategory6Code.ApplicationParametersSubsetCreation}</li>
	 * </ul>
	 */
	public static final DataSetCategory11Code ApplicationParametersSubsetCreation = new DataSetCategory11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParametersSubsetCreation";
			previousVersion_lazy = () -> DataSetCategory6Code.ApplicationParametersSubsetCreation;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory11Code.mmObject();
			codeName = DataSetCategoryCode.ApplicationParametersSubsetCreation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDownload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code#KeyDownload
	 * DataSetCategory6Code.KeyDownload}</li>
	 * </ul>
	 */
	public static final DataSetCategory11Code KeyDownload = new DataSetCategory11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDownload";
			previousVersion_lazy = () -> DataSetCategory6Code.KeyDownload;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory11Code.mmObject();
			codeName = DataSetCategoryCode.KeyDownload.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code#KeyManagement
	 * DataSetCategory6Code.KeyManagement}</li>
	 * </ul>
	 */
	public static final DataSetCategory11Code KeyManagement = new DataSetCategory11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyManagement";
			previousVersion_lazy = () -> DataSetCategory6Code.KeyManagement;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory11Code.mmObject();
			codeName = DataSetCategoryCode.KeyManagement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code#Reporting
	 * DataSetCategory6Code.Reporting}</li>
	 * </ul>
	 */
	public static final DataSetCategory11Code Reporting = new DataSetCategory11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			previousVersion_lazy = () -> DataSetCategory6Code.Reporting;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory11Code.mmObject();
			codeName = DataSetCategoryCode.Reporting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareModule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code#SoftwareModule
	 * DataSetCategory6Code.SoftwareModule}</li>
	 * </ul>
	 */
	public static final DataSetCategory11Code SoftwareModule = new DataSetCategory11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareModule";
			previousVersion_lazy = () -> DataSetCategory6Code.SoftwareModule;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory11Code.mmObject();
			codeName = DataSetCategoryCode.SoftwareModule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code#TMSProtocolParameters
	 * DataSetCategory6Code.TMSProtocolParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory11Code TMSProtocolParameters = new DataSetCategory11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			previousVersion_lazy = () -> DataSetCategory6Code.TMSProtocolParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory11Code.mmObject();
			codeName = DataSetCategoryCode.TMSProtocolParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code#MerchantParameters
	 * DataSetCategory6Code.MerchantParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory11Code MerchantParameters = new DataSetCategory11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			previousVersion_lazy = () -> DataSetCategory6Code.MerchantParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory11Code.mmObject();
			codeName = DataSetCategoryCode.MerchantParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code#TerminalParameters
	 * DataSetCategory6Code.TerminalParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory11Code TerminalParameters = new DataSetCategory11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			previousVersion_lazy = () -> DataSetCategory6Code.TerminalParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory11Code.mmObject();
			codeName = DataSetCategoryCode.TerminalParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateParameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory11Code CertificateParameters = new DataSetCategory11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory11Code.mmObject();
			codeName = DataSetCategoryCode.CertificateParameters.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DataSetCategory11Code> codesByName = new LinkedHashMap<>();

	protected DataSetCategory11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetCategory11Code";
				definition = "Maintenance service to delegate.";
				previousVersion_lazy = () -> DataSetCategory6Code.mmObject();
				trace_lazy = () -> DataSetCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory11Code.AcquirerProtocolParameters, com.tools20022.repository.codeset.DataSetCategory11Code.ApplicationParameters,
						com.tools20022.repository.codeset.DataSetCategory11Code.ApplicationParametersSubsetCreation, com.tools20022.repository.codeset.DataSetCategory11Code.KeyDownload,
						com.tools20022.repository.codeset.DataSetCategory11Code.KeyManagement, com.tools20022.repository.codeset.DataSetCategory11Code.Reporting, com.tools20022.repository.codeset.DataSetCategory11Code.SoftwareModule,
						com.tools20022.repository.codeset.DataSetCategory11Code.TMSProtocolParameters, com.tools20022.repository.codeset.DataSetCategory11Code.MerchantParameters,
						com.tools20022.repository.codeset.DataSetCategory11Code.TerminalParameters, com.tools20022.repository.codeset.DataSetCategory11Code.CertificateParameters);
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
	}

	public static DataSetCategory11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataSetCategory11Code[] values() {
		DataSetCategory11Code[] values = new DataSetCategory11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataSetCategory11Code> {
		@Override
		public DataSetCategory11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataSetCategory11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}