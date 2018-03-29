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
import com.tools20022.repository.codeset.DataSetCategory12Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Category of data set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#AcquirerParameters
 * DataSetCategory12Code.AcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#ApplicationParameters
 * DataSetCategory12Code.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#BatchCapture
 * DataSetCategory12Code.BatchCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#CaptureResponse
 * DataSetCategory12Code.CaptureResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#DelegationData
 * DataSetCategory12Code.DelegationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#ManagementPlan
 * DataSetCategory12Code.ManagementPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#MerchantParameters
 * DataSetCategory12Code.MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#SecurityParameters
 * DataSetCategory12Code.SecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#SoftwareModule
 * DataSetCategory12Code.SoftwareModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#StatusReport
 * DataSetCategory12Code.StatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#TerminalParameters
 * DataSetCategory12Code.TerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#VendorParameters
 * DataSetCategory12Code.VendorParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#Parameters
 * DataSetCategory12Code.Parameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#TMSProtocolParameters
 * DataSetCategory12Code.TMSProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#CertificateParameters
 * DataSetCategory12Code.CertificateParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#LogFile
 * DataSetCategory12Code.LogFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code#CertificateManagementRequest
 * DataSetCategory12Code.CertificateManagementRequest}</li>
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
 * "DataSetCategory12Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Category of data set."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
 * DataSetCategory9Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataSetCategory12Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#AcquirerParameters
	 * DataSetCategory9Code.AcquirerParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code AcquirerParameters = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerParameters";
			previousVersion_lazy = () -> DataSetCategory9Code.AcquirerParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.AcquirerParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#ApplicationParameters
	 * DataSetCategory9Code.ApplicationParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code ApplicationParameters = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			previousVersion_lazy = () -> DataSetCategory9Code.ApplicationParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.ApplicationParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#BatchCapture
	 * DataSetCategory9Code.BatchCapture}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code BatchCapture = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchCapture";
			previousVersion_lazy = () -> DataSetCategory9Code.BatchCapture;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.BatchCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#CaptureResponse
	 * DataSetCategory9Code.CaptureResponse}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code CaptureResponse = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaptureResponse";
			previousVersion_lazy = () -> DataSetCategory9Code.CaptureResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.CaptureResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#DelegationData
	 * DataSetCategory9Code.DelegationData}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code DelegationData = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationData";
			previousVersion_lazy = () -> DataSetCategory9Code.DelegationData;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.DelegationData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#ManagementPlan
	 * DataSetCategory9Code.ManagementPlan}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code ManagementPlan = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManagementPlan";
			previousVersion_lazy = () -> DataSetCategory9Code.ManagementPlan;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.ManagementPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#MerchantParameters
	 * DataSetCategory9Code.MerchantParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code MerchantParameters = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			previousVersion_lazy = () -> DataSetCategory9Code.MerchantParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.MerchantParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#SecurityParameters
	 * DataSetCategory9Code.SecurityParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code SecurityParameters = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			previousVersion_lazy = () -> DataSetCategory9Code.SecurityParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.SecurityParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareModule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#SoftwareModule
	 * DataSetCategory9Code.SoftwareModule}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code SoftwareModule = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareModule";
			previousVersion_lazy = () -> DataSetCategory9Code.SoftwareModule;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.SoftwareModule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#StatusReport
	 * DataSetCategory9Code.StatusReport}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code StatusReport = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			previousVersion_lazy = () -> DataSetCategory9Code.StatusReport;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.StatusReport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#TerminalParameters
	 * DataSetCategory9Code.TerminalParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code TerminalParameters = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			previousVersion_lazy = () -> DataSetCategory9Code.TerminalParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.TerminalParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#VendorParameters
	 * DataSetCategory9Code.VendorParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code VendorParameters = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorParameters";
			previousVersion_lazy = () -> DataSetCategory9Code.VendorParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.VendorParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#Parameters
	 * DataSetCategory9Code.Parameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code Parameters = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameters";
			previousVersion_lazy = () -> DataSetCategory9Code.Parameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.Parameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#TMSProtocolParameters
	 * DataSetCategory9Code.TMSProtocolParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code TMSProtocolParameters = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			previousVersion_lazy = () -> DataSetCategory9Code.TMSProtocolParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.TMSProtocolParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#CertificateParameters
	 * DataSetCategory9Code.CertificateParameters}</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code CertificateParameters = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			previousVersion_lazy = () -> DataSetCategory9Code.CertificateParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.CertificateParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LogFile"</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code LogFile = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LogFile";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.LogFile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateManagementRequest"</li>
	 * </ul>
	 */
	public static final DataSetCategory12Code CertificateManagementRequest = new DataSetCategory12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateManagementRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory12Code.mmObject();
			codeName = DataSetCategoryCode.CertificateManagementRequest.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DataSetCategory12Code> codesByName = new LinkedHashMap<>();

	protected DataSetCategory12Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AQPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetCategory12Code";
				definition = "Category of data set.";
				previousVersion_lazy = () -> DataSetCategory9Code.mmObject();
				trace_lazy = () -> DataSetCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory12Code.AcquirerParameters, com.tools20022.repository.codeset.DataSetCategory12Code.ApplicationParameters,
						com.tools20022.repository.codeset.DataSetCategory12Code.BatchCapture, com.tools20022.repository.codeset.DataSetCategory12Code.CaptureResponse, com.tools20022.repository.codeset.DataSetCategory12Code.DelegationData,
						com.tools20022.repository.codeset.DataSetCategory12Code.ManagementPlan, com.tools20022.repository.codeset.DataSetCategory12Code.MerchantParameters,
						com.tools20022.repository.codeset.DataSetCategory12Code.SecurityParameters, com.tools20022.repository.codeset.DataSetCategory12Code.SoftwareModule,
						com.tools20022.repository.codeset.DataSetCategory12Code.StatusReport, com.tools20022.repository.codeset.DataSetCategory12Code.TerminalParameters,
						com.tools20022.repository.codeset.DataSetCategory12Code.VendorParameters, com.tools20022.repository.codeset.DataSetCategory12Code.Parameters,
						com.tools20022.repository.codeset.DataSetCategory12Code.TMSProtocolParameters, com.tools20022.repository.codeset.DataSetCategory12Code.CertificateParameters,
						com.tools20022.repository.codeset.DataSetCategory12Code.LogFile, com.tools20022.repository.codeset.DataSetCategory12Code.CertificateManagementRequest);
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
		codesByName.put(TMSProtocolParameters.getCodeName().get(), TMSProtocolParameters);
		codesByName.put(CertificateParameters.getCodeName().get(), CertificateParameters);
		codesByName.put(LogFile.getCodeName().get(), LogFile);
		codesByName.put(CertificateManagementRequest.getCodeName().get(), CertificateManagementRequest);
	}

	public static DataSetCategory12Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataSetCategory12Code[] values() {
		DataSetCategory12Code[] values = new DataSetCategory12Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataSetCategory12Code> {
		@Override
		public DataSetCategory12Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataSetCategory12Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}