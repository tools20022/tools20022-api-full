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
import com.tools20022.repository.codeset.DataSetCategoryCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#SoftwareModule
 * DataSetCategoryCode.SoftwareModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#VendorParameters
 * DataSetCategoryCode.VendorParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#AcquirerParameters
 * DataSetCategoryCode.AcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#ApplicationParameters
 * DataSetCategoryCode.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#MerchantParameters
 * DataSetCategoryCode.MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#BatchCapture
 * DataSetCategoryCode.BatchCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#CaptureResponse
 * DataSetCategoryCode.CaptureResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#StatusReport
 * DataSetCategoryCode.StatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#DelegationData
 * DataSetCategoryCode.DelegationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#ManagementPlan
 * DataSetCategoryCode.ManagementPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#SecurityParameters
 * DataSetCategoryCode.SecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#TerminalParameters
 * DataSetCategoryCode.TerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#Parameters
 * DataSetCategoryCode.Parameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#MasterTerminalManager
 * DataSetCategoryCode.MasterTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#Monitoring
 * DataSetCategoryCode.Monitoring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#AcquirerProtocolParameters
 * DataSetCategoryCode.AcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#ApplicationParametersSubsetCreation
 * DataSetCategoryCode.ApplicationParametersSubsetCreation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#KeyDownload
 * DataSetCategoryCode.KeyDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#KeyManagement
 * DataSetCategoryCode.KeyManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#Reporting
 * DataSetCategoryCode.Reporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#TMSProtocolParameters
 * DataSetCategoryCode.TMSProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#ATMProtocol
 * DataSetCategoryCode.ATMProtocol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#ATMConfiguration
 * DataSetCategoryCode.ATMConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#CardApplication
 * DataSetCategoryCode.CardApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#CardConfiguration
 * DataSetCategoryCode.CardConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#OfflineExchangeRate
 * DataSetCategoryCode.OfflineExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#PreDefinedAmount
 * DataSetCategoryCode.PreDefinedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#LocationConfiguration
 * DataSetCategoryCode.LocationConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#MobileOperator
 * DataSetCategoryCode.MobileOperator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#ReconciliationError
 * DataSetCategoryCode.ReconciliationError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#CertificateParameters
 * DataSetCategoryCode.CertificateParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#CertificateManagementRequest
 * DataSetCategoryCode.CertificateManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#LogFile
 * DataSetCategoryCode.LogFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#SaleToPOIProtocolParameters
 * DataSetCategoryCode.SaleToPOIProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode#SaleComponent
 * DataSetCategoryCode.SaleComponent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory2Code
 * DataSetCategory2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory3Code
 * DataSetCategory3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory1Code
 * DataSetCategory1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
 * DataSetCategory5Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory6Code
 * DataSetCategory6Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
 * DataSetCategory4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory7Code
 * DataSetCategory7Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
 * DataSetCategory9Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
 * DataSetCategory10Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory8Code
 * DataSetCategory8Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
 * DataSetCategory11Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
 * DataSetCategory12Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory13Code
 * DataSetCategory13Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetCategoryCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Category of data set to transfer."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataSetCategoryCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Software module.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWPK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareModule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Software module."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode SoftwareModule = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SoftwareModule";
			definition = "Software module.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "SWPK";
		}
	};
	/**
	 * Point of interaction parameters defined by the manufacturer for instance
	 * the PIN verification capabilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VDPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode VendorParameters = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VendorParameters";
			definition = "Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "VDPR";
		}
	};
	/**
	 * Acquirer specific configuration parameters for the point of interaction
	 * (POI) system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AQPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer specific configuration parameters for the point of interaction (POI) system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode AcquirerParameters = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcquirerParameters";
			definition = "Acquirer specific configuration parameters for the point of interaction (POI) system.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "AQPR";
		}
	};
	/**
	 * Payment application specific configuration parameters for the point of
	 * interaction (POI) system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment application specific configuration parameters for the point of interaction (POI) system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode ApplicationParameters = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Payment application specific configuration parameters for the point of interaction (POI) system.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "APPR";
		}
	};
	/**
	 * Merchant configuration parameters for the point of interaction (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Merchant configuration parameters for the point of interaction (POI)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode MerchantParameters = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantParameters";
			definition = "Merchant configuration parameters for the point of interaction (POI).";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "MRPR";
		}
	};
	/**
	 * Batch upload of transaction data (data capture of a group of
	 * transactions).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXCP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Batch upload of transaction data (data capture of a group of transactions)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode BatchCapture = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BatchCapture";
			definition = "Batch upload of transaction data (data capture of a group of transactions).";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "TXCP";
		}
	};
	/**
	 * Batch download response for the batch capture of transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AKCP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Batch download response for the batch capture of transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode CaptureResponse = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CaptureResponse";
			definition = "Batch download response for the batch capture of transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "AKCP";
		}
	};
	/**
	 * Report of software configuration and parameter status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STRP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report of software configuration and parameter status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode StatusReport = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusReport";
			definition = "Report of software configuration and parameter status.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "STRP";
		}
	};
	/**
	 * Data needed to create a terminal management sub-domain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLGT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data needed to create a terminal management sub-domain."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode DelegationData = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DelegationData";
			definition = "Data needed to create a terminal management sub-domain.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "DLGT";
		}
	};
	/**
	 * Configuration of management plan in the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGTP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration of management plan in the point of interaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode ManagementPlan = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManagementPlan";
			definition = "Configuration of management plan in the point of interaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "MGTP";
		}
	};
	/**
	 * Point of interaction parameters related to the security of software
	 * application and application protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction parameters related to the security of software application and application protocol."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode SecurityParameters = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityParameters";
			definition = "Point of interaction parameters related to the security of software application and application protocol.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "SCPR";
		}
	};
	/**
	 * Point of interaction parameters attached to the terminal as serial number
	 * or physical capabilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction parameters attached to the terminal as serial number or physical capabilities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode TerminalParameters = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalParameters";
			definition = "Point of interaction parameters attached to the terminal as serial number or physical capabilities.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "TRPR";
		}
	};
	/**
	 * Any combination of configuration parameters for the point of interaction
	 * (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any combination of configuration parameters for the point of interaction (POI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode Parameters = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameters";
			definition = "Any combination of configuration parameters for the point of interaction (POI).";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "PARA";
		}
	};
	/**
	 * The terminal manager is the master.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTMG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTerminalManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The terminal manager is the master."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode MasterTerminalManager = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTerminalManager";
			definition = "The terminal manager is the master.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "MTMG";
		}
	};
	/**
	 * Monitoring of the terminal estate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTOR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monitoring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Monitoring of the terminal estate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode Monitoring = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monitoring";
			definition = "Monitoring of the terminal estate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "MTOR";
		}
	};
	/**
	 * Configuration parameters of the payment acquirer protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACQP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters of the payment acquirer protocol."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode AcquirerProtocolParameters = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProtocolParameters";
			definition = "Configuration parameters of the payment acquirer protocol.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "ACQP";
		}
	};
	/**
	 * Creation of a subset of the configuration parameters of an application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APSB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParametersSubsetCreation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creation of a subset of the configuration parameters of an application."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode ApplicationParametersSubsetCreation = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParametersSubsetCreation";
			definition = "Creation of a subset of the configuration parameters of an application.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "APSB";
		}
	};
	/**
	 * Download of cryptographic keys with the related information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KDWL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDownload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Download of cryptographic keys with the related information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode KeyDownload = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDownload";
			definition = "Download of cryptographic keys with the related information.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "KDWL";
		}
	};
	/**
	 * Activate, deactivate or revoke loaded cryptographic keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KMGT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Activate, deactivate or revoke loaded cryptographic keys."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode KeyManagement = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyManagement";
			definition = "Activate, deactivate or revoke loaded cryptographic keys.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "KMGT";
		}
	};
	/**
	 * Reporting on activity, status and error of a point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPRT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reporting on activity, status and error of a point of interaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode Reporting = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Reporting on activity, status and error of a point of interaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "RPRT";
		}
	};
	/**
	 * Configuration parameters for the TMS protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMSP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters for the TMS protocol."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode TMSProtocolParameters = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			definition = "Configuration parameters for the TMS protocol.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "TMSP";
		}
	};
	/**
	 * ATM protocol parameters, including the configuration of the hosts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATMP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMProtocol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ATM protocol parameters, including the configuration of the hosts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode ATMProtocol = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMProtocol";
			definition = "ATM protocol parameters, including the configuration of the hosts.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "ATMP";
		}
	};
	/**
	 * Configuration parameters of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATMC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters of the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode ATMConfiguration = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMConfiguration";
			definition = "Configuration parameters of the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "ATMC";
		}
	};
	/**
	 * Configuration parameters of the card application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRAP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardApplication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters of the card application."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode CardApplication = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardApplication";
			definition = "Configuration parameters of the card application.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "CRAP";
		}
	};
	/**
	 * Configuration of the cards accepted by the terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPRC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of the cards accepted by the terminal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode CardConfiguration = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardConfiguration";
			definition = "Configuration of the cards accepted by the terminal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "CPRC";
		}
	};
	/**
	 * Local rates for currency exchanges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OEXR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local rates for currency exchanges."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode OfflineExchangeRate = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineExchangeRate";
			definition = "Local rates for currency exchanges.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "OEXR";
		}
	};
	/**
	 * Predefined amounts to be presented to the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMNT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreDefinedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Predefined amounts to be presented to the customer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode PreDefinedAmount = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreDefinedAmount";
			definition = "Predefined amounts to be presented to the customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "AMNT";
		}
	};
	/**
	 * Configuration of the location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOCC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocationConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of the location."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode LocationConfiguration = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocationConfiguration";
			definition = "Configuration of the location.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "LOCC";
		}
	};
	/**
	 * Configuration of the mobile operator cards accepted by the terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNOC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobileOperator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration of the mobile operator cards accepted by the terminal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode MobileOperator = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobileOperator";
			definition = "Configuration of the mobile operator cards accepted by the terminal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "MNOC";
		}
	};
	/**
	 * Batch of transaction that have generated an error in the totals of the
	 * reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCLE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Batch of transaction that have generated an error in the totals of the reconciliation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode ReconciliationError = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationError";
			definition = "Batch of transaction that have generated an error in the totals of the reconciliation.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "RCLE";
		}
	};
	/**
	 * Certificate provided by a terminal manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate provided by a terminal manager."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode CertificateParameters = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			definition = "Certificate provided by a terminal manager.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "CRTF";
		}
	};
	/**
	 * Trigger for CertificateManagementRequest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMRQ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateManagementRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger for CertificateManagementRequest."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode CertificateManagementRequest = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateManagementRequest";
			definition = "Trigger for CertificateManagementRequest.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "CMRQ";
		}
	};
	/**
	 * Any repository used for recording log traces.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOGF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LogFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Any repository used for recording log traces."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode LogFile = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LogFile";
			definition = "Any repository used for recording log traces.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "LOGF";
		}
	};
	/**
	 * Parameters related to the Sale to POI protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleToPOIProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters related to the Sale to POI protocol."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode SaleToPOIProtocolParameters = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleToPOIProtocolParameters";
			definition = "Parameters related to the Sale to POI protocol.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "SAPR";
		}
	};
	/**
	 * Component of the Sale system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
	 * DataSetCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SACP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Component of the Sale system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DataSetCategoryCode SaleComponent = new DataSetCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleComponent";
			definition = "Component of the Sale system.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategoryCode.mmObject();
			codeName = "SACP";
		}
	};
	final static private LinkedHashMap<String, DataSetCategoryCode> codesByName = new LinkedHashMap<>();

	protected DataSetCategoryCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SWPK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetCategoryCode";
				definition = "Category of data set to transfer.";
				derivation_lazy = () -> Arrays.asList(DataSetCategory2Code.mmObject(), DataSetCategory3Code.mmObject(), DataSetCategory1Code.mmObject(), DataSetCategory5Code.mmObject(), DataSetCategory6Code.mmObject(),
						DataSetCategory4Code.mmObject(), DataSetCategory7Code.mmObject(), DataSetCategory9Code.mmObject(), DataSetCategory10Code.mmObject(), DataSetCategory8Code.mmObject(), DataSetCategory11Code.mmObject(),
						DataSetCategory12Code.mmObject(), DataSetCategory13Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategoryCode.SoftwareModule, com.tools20022.repository.codeset.DataSetCategoryCode.VendorParameters,
						com.tools20022.repository.codeset.DataSetCategoryCode.AcquirerParameters, com.tools20022.repository.codeset.DataSetCategoryCode.ApplicationParameters,
						com.tools20022.repository.codeset.DataSetCategoryCode.MerchantParameters, com.tools20022.repository.codeset.DataSetCategoryCode.BatchCapture, com.tools20022.repository.codeset.DataSetCategoryCode.CaptureResponse,
						com.tools20022.repository.codeset.DataSetCategoryCode.StatusReport, com.tools20022.repository.codeset.DataSetCategoryCode.DelegationData, com.tools20022.repository.codeset.DataSetCategoryCode.ManagementPlan,
						com.tools20022.repository.codeset.DataSetCategoryCode.SecurityParameters, com.tools20022.repository.codeset.DataSetCategoryCode.TerminalParameters, com.tools20022.repository.codeset.DataSetCategoryCode.Parameters,
						com.tools20022.repository.codeset.DataSetCategoryCode.MasterTerminalManager, com.tools20022.repository.codeset.DataSetCategoryCode.Monitoring,
						com.tools20022.repository.codeset.DataSetCategoryCode.AcquirerProtocolParameters, com.tools20022.repository.codeset.DataSetCategoryCode.ApplicationParametersSubsetCreation,
						com.tools20022.repository.codeset.DataSetCategoryCode.KeyDownload, com.tools20022.repository.codeset.DataSetCategoryCode.KeyManagement, com.tools20022.repository.codeset.DataSetCategoryCode.Reporting,
						com.tools20022.repository.codeset.DataSetCategoryCode.TMSProtocolParameters, com.tools20022.repository.codeset.DataSetCategoryCode.ATMProtocol, com.tools20022.repository.codeset.DataSetCategoryCode.ATMConfiguration,
						com.tools20022.repository.codeset.DataSetCategoryCode.CardApplication, com.tools20022.repository.codeset.DataSetCategoryCode.CardConfiguration,
						com.tools20022.repository.codeset.DataSetCategoryCode.OfflineExchangeRate, com.tools20022.repository.codeset.DataSetCategoryCode.PreDefinedAmount,
						com.tools20022.repository.codeset.DataSetCategoryCode.LocationConfiguration, com.tools20022.repository.codeset.DataSetCategoryCode.MobileOperator,
						com.tools20022.repository.codeset.DataSetCategoryCode.ReconciliationError, com.tools20022.repository.codeset.DataSetCategoryCode.CertificateParameters,
						com.tools20022.repository.codeset.DataSetCategoryCode.CertificateManagementRequest, com.tools20022.repository.codeset.DataSetCategoryCode.LogFile,
						com.tools20022.repository.codeset.DataSetCategoryCode.SaleToPOIProtocolParameters, com.tools20022.repository.codeset.DataSetCategoryCode.SaleComponent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SoftwareModule.getCodeName().get(), SoftwareModule);
		codesByName.put(VendorParameters.getCodeName().get(), VendorParameters);
		codesByName.put(AcquirerParameters.getCodeName().get(), AcquirerParameters);
		codesByName.put(ApplicationParameters.getCodeName().get(), ApplicationParameters);
		codesByName.put(MerchantParameters.getCodeName().get(), MerchantParameters);
		codesByName.put(BatchCapture.getCodeName().get(), BatchCapture);
		codesByName.put(CaptureResponse.getCodeName().get(), CaptureResponse);
		codesByName.put(StatusReport.getCodeName().get(), StatusReport);
		codesByName.put(DelegationData.getCodeName().get(), DelegationData);
		codesByName.put(ManagementPlan.getCodeName().get(), ManagementPlan);
		codesByName.put(SecurityParameters.getCodeName().get(), SecurityParameters);
		codesByName.put(TerminalParameters.getCodeName().get(), TerminalParameters);
		codesByName.put(Parameters.getCodeName().get(), Parameters);
		codesByName.put(MasterTerminalManager.getCodeName().get(), MasterTerminalManager);
		codesByName.put(Monitoring.getCodeName().get(), Monitoring);
		codesByName.put(AcquirerProtocolParameters.getCodeName().get(), AcquirerProtocolParameters);
		codesByName.put(ApplicationParametersSubsetCreation.getCodeName().get(), ApplicationParametersSubsetCreation);
		codesByName.put(KeyDownload.getCodeName().get(), KeyDownload);
		codesByName.put(KeyManagement.getCodeName().get(), KeyManagement);
		codesByName.put(Reporting.getCodeName().get(), Reporting);
		codesByName.put(TMSProtocolParameters.getCodeName().get(), TMSProtocolParameters);
		codesByName.put(ATMProtocol.getCodeName().get(), ATMProtocol);
		codesByName.put(ATMConfiguration.getCodeName().get(), ATMConfiguration);
		codesByName.put(CardApplication.getCodeName().get(), CardApplication);
		codesByName.put(CardConfiguration.getCodeName().get(), CardConfiguration);
		codesByName.put(OfflineExchangeRate.getCodeName().get(), OfflineExchangeRate);
		codesByName.put(PreDefinedAmount.getCodeName().get(), PreDefinedAmount);
		codesByName.put(LocationConfiguration.getCodeName().get(), LocationConfiguration);
		codesByName.put(MobileOperator.getCodeName().get(), MobileOperator);
		codesByName.put(ReconciliationError.getCodeName().get(), ReconciliationError);
		codesByName.put(CertificateParameters.getCodeName().get(), CertificateParameters);
		codesByName.put(CertificateManagementRequest.getCodeName().get(), CertificateManagementRequest);
		codesByName.put(LogFile.getCodeName().get(), LogFile);
		codesByName.put(SaleToPOIProtocolParameters.getCodeName().get(), SaleToPOIProtocolParameters);
		codesByName.put(SaleComponent.getCodeName().get(), SaleComponent);
	}

	public static DataSetCategoryCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataSetCategoryCode[] values() {
		DataSetCategoryCode[] values = new DataSetCategoryCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataSetCategoryCode> {
		@Override
		public DataSetCategoryCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataSetCategoryCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}