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
import com.tools20022.repository.codeset.DataSetCategory1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Category of data set to transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code#SoftwareModule
 * DataSetCategory1Code.SoftwareModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code#VendorParameters
 * DataSetCategory1Code.VendorParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code#AcquirerParameters
 * DataSetCategory1Code.AcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code#MerchantParameters
 * DataSetCategory1Code.MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code#BatchCapture
 * DataSetCategory1Code.BatchCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code#CaptureResponse
 * DataSetCategory1Code.CaptureResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code#StatusReport
 * DataSetCategory1Code.StatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code#DelegationData
 * DataSetCategory1Code.DelegationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code#ManagementPlan
 * DataSetCategory1Code.ManagementPlan}</li>
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
 * <li>"SWPK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetCategory1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Category of data set to transfer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory8Code
 * DataSetCategory8Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataSetCategory1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code
	 * DataSetCategory1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory8Code#SoftwareModule
	 * DataSetCategory8Code.SoftwareModule}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory1Code SoftwareModule = new DataSetCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareModule";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory8Code.SoftwareModule);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory1Code.mmObject();
			codeName = DataSetCategoryCode.SoftwareModule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code
	 * DataSetCategory1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory8Code#VendorParameters
	 * DataSetCategory8Code.VendorParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory1Code VendorParameters = new DataSetCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory8Code.VendorParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory1Code.mmObject();
			codeName = DataSetCategoryCode.VendorParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code
	 * DataSetCategory1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory8Code#AcquirerParameters
	 * DataSetCategory8Code.AcquirerParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory1Code AcquirerParameters = new DataSetCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory8Code.AcquirerParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory1Code.mmObject();
			codeName = DataSetCategoryCode.AcquirerParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code
	 * DataSetCategory1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory8Code#MerchantParameters
	 * DataSetCategory8Code.MerchantParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory1Code MerchantParameters = new DataSetCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory8Code.MerchantParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory1Code.mmObject();
			codeName = DataSetCategoryCode.MerchantParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code
	 * DataSetCategory1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory8Code#BatchCapture
	 * DataSetCategory8Code.BatchCapture}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory1Code BatchCapture = new DataSetCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchCapture";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory8Code.BatchCapture);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory1Code.mmObject();
			codeName = DataSetCategoryCode.BatchCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code
	 * DataSetCategory1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory8Code#CaptureResponse
	 * DataSetCategory8Code.CaptureResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory1Code CaptureResponse = new DataSetCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaptureResponse";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory8Code.CaptureResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory1Code.mmObject();
			codeName = DataSetCategoryCode.CaptureResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code
	 * DataSetCategory1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory8Code#StatusReport
	 * DataSetCategory8Code.StatusReport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory1Code StatusReport = new DataSetCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory8Code.StatusReport);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory1Code.mmObject();
			codeName = DataSetCategoryCode.StatusReport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code
	 * DataSetCategory1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory8Code#DelegationData
	 * DataSetCategory8Code.DelegationData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory1Code DelegationData = new DataSetCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationData";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory8Code.DelegationData);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory1Code.mmObject();
			codeName = DataSetCategoryCode.DelegationData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory1Code
	 * DataSetCategory1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory8Code#ManagementPlan
	 * DataSetCategory8Code.ManagementPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory1Code ManagementPlan = new DataSetCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManagementPlan";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory8Code.ManagementPlan);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory1Code.mmObject();
			codeName = DataSetCategoryCode.ManagementPlan.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DataSetCategory1Code> codesByName = new LinkedHashMap<>();

	protected DataSetCategory1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SWPK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetCategory1Code";
				definition = "Category of data set to transfer.";
				nextVersions_lazy = () -> Arrays.asList(DataSetCategory8Code.mmObject());
				trace_lazy = () -> DataSetCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory1Code.SoftwareModule, com.tools20022.repository.codeset.DataSetCategory1Code.VendorParameters,
						com.tools20022.repository.codeset.DataSetCategory1Code.AcquirerParameters, com.tools20022.repository.codeset.DataSetCategory1Code.MerchantParameters,
						com.tools20022.repository.codeset.DataSetCategory1Code.BatchCapture, com.tools20022.repository.codeset.DataSetCategory1Code.CaptureResponse, com.tools20022.repository.codeset.DataSetCategory1Code.StatusReport,
						com.tools20022.repository.codeset.DataSetCategory1Code.DelegationData, com.tools20022.repository.codeset.DataSetCategory1Code.ManagementPlan);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SoftwareModule.getCodeName().get(), SoftwareModule);
		codesByName.put(VendorParameters.getCodeName().get(), VendorParameters);
		codesByName.put(AcquirerParameters.getCodeName().get(), AcquirerParameters);
		codesByName.put(MerchantParameters.getCodeName().get(), MerchantParameters);
		codesByName.put(BatchCapture.getCodeName().get(), BatchCapture);
		codesByName.put(CaptureResponse.getCodeName().get(), CaptureResponse);
		codesByName.put(StatusReport.getCodeName().get(), StatusReport);
		codesByName.put(DelegationData.getCodeName().get(), DelegationData);
		codesByName.put(ManagementPlan.getCodeName().get(), ManagementPlan);
	}

	public static DataSetCategory1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataSetCategory1Code[] values() {
		DataSetCategory1Code[] values = new DataSetCategory1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataSetCategory1Code> {
		@Override
		public DataSetCategory1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataSetCategory1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}