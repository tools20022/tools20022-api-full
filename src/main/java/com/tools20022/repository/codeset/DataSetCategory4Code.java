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
import com.tools20022.repository.codeset.DataSetCategory4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#AcquirerParameters
 * DataSetCategory4Code.AcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#ApplicationParameters
 * DataSetCategory4Code.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#BatchCapture
 * DataSetCategory4Code.BatchCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#CaptureResponse
 * DataSetCategory4Code.CaptureResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#DelegationData
 * DataSetCategory4Code.DelegationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#ManagementPlan
 * DataSetCategory4Code.ManagementPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#MerchantParameters
 * DataSetCategory4Code.MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#SecurityParameters
 * DataSetCategory4Code.SecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#SoftwareModule
 * DataSetCategory4Code.SoftwareModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#StatusReport
 * DataSetCategory4Code.StatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#TerminalParameters
 * DataSetCategory4Code.TerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#VendorParameters
 * DataSetCategory4Code.VendorParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code#Parameters
 * DataSetCategory4Code.Parameters}</li>
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
 * "DataSetCategory4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Category of data set to transfer to the point of interaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
 * DataSetCategory9Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
 * DataSetCategory3Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataSetCategory4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#AcquirerParameters
	 * DataSetCategory9Code.AcquirerParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#AcquirerParameters
	 * DataSetCategory3Code.AcquirerParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code AcquirerParameters = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.AcquirerParameters);
			previousVersion_lazy = () -> DataSetCategory3Code.AcquirerParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.AcquirerParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#ApplicationParameters
	 * DataSetCategory9Code.ApplicationParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#ApplicationParameters
	 * DataSetCategory3Code.ApplicationParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code ApplicationParameters = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.ApplicationParameters);
			previousVersion_lazy = () -> DataSetCategory3Code.ApplicationParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.ApplicationParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#BatchCapture
	 * DataSetCategory9Code.BatchCapture}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#BatchCapture
	 * DataSetCategory3Code.BatchCapture}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code BatchCapture = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchCapture";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.BatchCapture);
			previousVersion_lazy = () -> DataSetCategory3Code.BatchCapture;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.BatchCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#CaptureResponse
	 * DataSetCategory9Code.CaptureResponse}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#CaptureResponse
	 * DataSetCategory3Code.CaptureResponse}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code CaptureResponse = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaptureResponse";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.CaptureResponse);
			previousVersion_lazy = () -> DataSetCategory3Code.CaptureResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.CaptureResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#DelegationData
	 * DataSetCategory9Code.DelegationData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#DelegationData
	 * DataSetCategory3Code.DelegationData}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code DelegationData = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationData";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.DelegationData);
			previousVersion_lazy = () -> DataSetCategory3Code.DelegationData;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.DelegationData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#ManagementPlan
	 * DataSetCategory9Code.ManagementPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#ManagementPlan
	 * DataSetCategory3Code.ManagementPlan}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code ManagementPlan = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManagementPlan";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.ManagementPlan);
			previousVersion_lazy = () -> DataSetCategory3Code.ManagementPlan;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.ManagementPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#MerchantParameters
	 * DataSetCategory9Code.MerchantParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#MerchantParameters
	 * DataSetCategory3Code.MerchantParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code MerchantParameters = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.MerchantParameters);
			previousVersion_lazy = () -> DataSetCategory3Code.MerchantParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.MerchantParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#SecurityParameters
	 * DataSetCategory9Code.SecurityParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#SecurityParameters
	 * DataSetCategory3Code.SecurityParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code SecurityParameters = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.SecurityParameters);
			previousVersion_lazy = () -> DataSetCategory3Code.SecurityParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.SecurityParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#SoftwareModule
	 * DataSetCategory9Code.SoftwareModule}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#SoftwareModule
	 * DataSetCategory3Code.SoftwareModule}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code SoftwareModule = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareModule";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.SoftwareModule);
			previousVersion_lazy = () -> DataSetCategory3Code.SoftwareModule;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.SoftwareModule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#StatusReport
	 * DataSetCategory9Code.StatusReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#StatusReport
	 * DataSetCategory3Code.StatusReport}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code StatusReport = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.StatusReport);
			previousVersion_lazy = () -> DataSetCategory3Code.StatusReport;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.StatusReport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#TerminalParameters
	 * DataSetCategory9Code.TerminalParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#TerminalParameters
	 * DataSetCategory3Code.TerminalParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code TerminalParameters = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.TerminalParameters);
			previousVersion_lazy = () -> DataSetCategory3Code.TerminalParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.TerminalParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#VendorParameters
	 * DataSetCategory9Code.VendorParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory3Code#VendorParameters
	 * DataSetCategory3Code.VendorParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory4Code VendorParameters = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.VendorParameters);
			previousVersion_lazy = () -> DataSetCategory3Code.VendorParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.VendorParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#Parameters
	 * DataSetCategory9Code.Parameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory4Code Parameters = new DataSetCategory4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.Parameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory4Code.mmObject();
			codeName = DataSetCategoryCode.Parameters.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DataSetCategory4Code> codesByName = new LinkedHashMap<>();

	protected DataSetCategory4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AQPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetCategory4Code";
				definition = "Category of data set to transfer to the point of interaction.";
				nextVersions_lazy = () -> Arrays.asList(DataSetCategory9Code.mmObject());
				previousVersion_lazy = () -> DataSetCategory3Code.mmObject();
				trace_lazy = () -> DataSetCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory4Code.AcquirerParameters, com.tools20022.repository.codeset.DataSetCategory4Code.ApplicationParameters,
						com.tools20022.repository.codeset.DataSetCategory4Code.BatchCapture, com.tools20022.repository.codeset.DataSetCategory4Code.CaptureResponse, com.tools20022.repository.codeset.DataSetCategory4Code.DelegationData,
						com.tools20022.repository.codeset.DataSetCategory4Code.ManagementPlan, com.tools20022.repository.codeset.DataSetCategory4Code.MerchantParameters,
						com.tools20022.repository.codeset.DataSetCategory4Code.SecurityParameters, com.tools20022.repository.codeset.DataSetCategory4Code.SoftwareModule, com.tools20022.repository.codeset.DataSetCategory4Code.StatusReport,
						com.tools20022.repository.codeset.DataSetCategory4Code.TerminalParameters, com.tools20022.repository.codeset.DataSetCategory4Code.VendorParameters, com.tools20022.repository.codeset.DataSetCategory4Code.Parameters);
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
		codesByName.put(Parameters.getCodeName().get(), Parameters);
	}

	public static DataSetCategory4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataSetCategory4Code[] values() {
		DataSetCategory4Code[] values = new DataSetCategory4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataSetCategory4Code> {
		@Override
		public DataSetCategory4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataSetCategory4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}