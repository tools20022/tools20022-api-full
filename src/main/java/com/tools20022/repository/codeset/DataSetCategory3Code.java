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
import com.tools20022.repository.codeset.DataSetCategory3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Category of data set to transfer to the point of interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#AcquirerParameters
 * DataSetCategory3Code.AcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#ApplicationParameters
 * DataSetCategory3Code.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#BatchCapture
 * DataSetCategory3Code.BatchCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#CaptureResponse
 * DataSetCategory3Code.CaptureResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#DelegationData
 * DataSetCategory3Code.DelegationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#ManagementPlan
 * DataSetCategory3Code.ManagementPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#MerchantParameters
 * DataSetCategory3Code.MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#SecurityParameters
 * DataSetCategory3Code.SecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#SoftwareModule
 * DataSetCategory3Code.SoftwareModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#StatusReport
 * DataSetCategory3Code.StatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#TerminalParameters
 * DataSetCategory3Code.TerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#VendorParameters
 * DataSetCategory3Code.VendorParameters}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AQPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetCategory3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Category of data set to transfer to the point of interaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
 * DataSetCategory4Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataSetCategory3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#AcquirerParameters
	 * DataSetCategory4Code.AcquirerParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code AcquirerParameters = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.AcquirerParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.AcquirerParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#ApplicationParameters
	 * DataSetCategory4Code.ApplicationParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code ApplicationParameters = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.ApplicationParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.ApplicationParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchCapture"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#BatchCapture
	 * DataSetCategory4Code.BatchCapture}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code BatchCapture = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchCapture";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.BatchCapture);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.BatchCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#CaptureResponse
	 * DataSetCategory4Code.CaptureResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code CaptureResponse = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaptureResponse";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.CaptureResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.CaptureResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#DelegationData
	 * DataSetCategory4Code.DelegationData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code DelegationData = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationData";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.DelegationData);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.DelegationData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementPlan"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#ManagementPlan
	 * DataSetCategory4Code.ManagementPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code ManagementPlan = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManagementPlan";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.ManagementPlan);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.ManagementPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#MerchantParameters
	 * DataSetCategory4Code.MerchantParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code MerchantParameters = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.MerchantParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.MerchantParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#SecurityParameters
	 * DataSetCategory4Code.SecurityParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code SecurityParameters = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.SecurityParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.SecurityParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareModule"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#SoftwareModule
	 * DataSetCategory4Code.SoftwareModule}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code SoftwareModule = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareModule";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.SoftwareModule);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.SoftwareModule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#StatusReport
	 * DataSetCategory4Code.StatusReport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code StatusReport = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.StatusReport);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.StatusReport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#TerminalParameters
	 * DataSetCategory4Code.TerminalParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code TerminalParameters = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.TerminalParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.TerminalParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
	 * DataSetCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#VendorParameters
	 * DataSetCategory4Code.VendorParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory3Code VendorParameters = new DataSetCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.VendorParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory3Code.mmObject();
			codeName = DataSetCategoryCode.VendorParameters.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DataSetCategory3Code> codesByName = new LinkedHashMap<>();

	protected DataSetCategory3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AQPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetCategory3Code";
				definition = "Category of data set to transfer to the point of interaction.";
				nextVersions_lazy = () -> Arrays.asList(DataSetCategory4Code.mmObject());
				trace_lazy = () -> DataSetCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory3Code.AcquirerParameters, com.tools20022.repository.codeset.DataSetCategory3Code.ApplicationParameters,
						com.tools20022.repository.codeset.DataSetCategory3Code.BatchCapture, com.tools20022.repository.codeset.DataSetCategory3Code.CaptureResponse, com.tools20022.repository.codeset.DataSetCategory3Code.DelegationData,
						com.tools20022.repository.codeset.DataSetCategory3Code.ManagementPlan, com.tools20022.repository.codeset.DataSetCategory3Code.MerchantParameters,
						com.tools20022.repository.codeset.DataSetCategory3Code.SecurityParameters, com.tools20022.repository.codeset.DataSetCategory3Code.SoftwareModule, com.tools20022.repository.codeset.DataSetCategory3Code.StatusReport,
						com.tools20022.repository.codeset.DataSetCategory3Code.TerminalParameters, com.tools20022.repository.codeset.DataSetCategory3Code.VendorParameters);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcquirerParameters.getCodeName().get(), AcquirerParameters);
		codesByName.put(ApplicationParameters.getCodeName().get(), ApplicationParameters);
		codesByName.put(BatchCapture.getCodeName().get(), BatchCapture);
		codesByName.put(CaptureResponse.getCodeName().get(), CaptureResponse);
		codesByName.put(DelegationData.getCodeName().get(), DelegationData);
		codesByName.put(ManagementPlan.getCodeName().get(), ManagementPlan);
		codesByName.put(MerchantParameters.getCodeName().get(), MerchantParameters);
		codesByName.put(SecurityParameters.getCodeName().get(), SecurityParameters);
		codesByName.put(SoftwareModule.getCodeName().get(), SoftwareModule);
		codesByName.put(StatusReport.getCodeName().get(), StatusReport);
		codesByName.put(TerminalParameters.getCodeName().get(), TerminalParameters);
		codesByName.put(VendorParameters.getCodeName().get(), VendorParameters);
	}

	public static DataSetCategory3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataSetCategory3Code[] values() {
		DataSetCategory3Code[] values = new DataSetCategory3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataSetCategory3Code> {
		@Override
		public DataSetCategory3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataSetCategory3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}