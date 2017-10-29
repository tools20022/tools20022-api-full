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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * </ul>
 * </li>
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
 * "DataSetCategoryCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Category of data set to transfer."</li>
 * </ul>
 */
public class DataSetCategoryCode {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareModule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Software module."</li>
	 * </ul>
	 */
	public static final MMCode SoftwareModule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SoftwareModule";
			definition = "Software module.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode VendorParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VendorParameters";
			definition = "Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer specific configuration parameters for the point of interaction (POI) system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AcquirerParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcquirerParameters";
			definition = "Acquirer specific configuration parameters for the point of interaction (POI) system.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment application specific configuration parameters for the point of interaction (POI) system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ApplicationParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Payment application specific configuration parameters for the point of interaction (POI) system.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Merchant configuration parameters for the point of interaction (POI)."</li>
	 * </ul>
	 */
	public static final MMCode MerchantParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantParameters";
			definition = "Merchant configuration parameters for the point of interaction (POI).";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Batch upload of transaction data (data capture of a group of transactions)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode BatchCapture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BatchCapture";
			definition = "Batch upload of transaction data (data capture of a group of transactions).";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Batch download response for the batch capture of transactions."</li>
	 * </ul>
	 */
	public static final MMCode CaptureResponse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CaptureResponse";
			definition = "Batch download response for the batch capture of transactions.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report of software configuration and parameter status."</li>
	 * </ul>
	 */
	public static final MMCode StatusReport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusReport";
			definition = "Report of software configuration and parameter status.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data needed to create a terminal management sub-domain."</li>
	 * </ul>
	 */
	public static final MMCode DelegationData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DelegationData";
			definition = "Data needed to create a terminal management sub-domain.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration of management plan in the point of interaction."</li>
	 * </ul>
	 */
	public static final MMCode ManagementPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManagementPlan";
			definition = "Configuration of management plan in the point of interaction.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction parameters related to the security of software application and application protocol."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SecurityParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityParameters";
			definition = "Point of interaction parameters related to the security of software application and application protocol.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction parameters attached to the terminal as serial number or physical capabilities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TerminalParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalParameters";
			definition = "Point of interaction parameters attached to the terminal as serial number or physical capabilities.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any combination of configuration parameters for the point of interaction (POI)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Parameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameters";
			definition = "Any combination of configuration parameters for the point of interaction (POI).";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTerminalManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The terminal manager is the master."</li>
	 * </ul>
	 */
	public static final MMCode MasterTerminalManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTerminalManager";
			definition = "The terminal manager is the master.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monitoring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Monitoring of the terminal estate."</li>
	 * </ul>
	 */
	public static final MMCode Monitoring = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monitoring";
			definition = "Monitoring of the terminal estate.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters of the payment acquirer protocol."</li>
	 * </ul>
	 */
	public static final MMCode AcquirerProtocolParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProtocolParameters";
			definition = "Configuration parameters of the payment acquirer protocol.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParametersSubsetCreation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creation of a subset of the configuration parameters of an application."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ApplicationParametersSubsetCreation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParametersSubsetCreation";
			definition = "Creation of a subset of the configuration parameters of an application.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDownload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Download of cryptographic keys with the related information."</li>
	 * </ul>
	 */
	public static final MMCode KeyDownload = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDownload";
			definition = "Download of cryptographic keys with the related information.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Activate, deactivate or revoke loaded cryptographic keys."
	 * </li>
	 * </ul>
	 */
	public static final MMCode KeyManagement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyManagement";
			definition = "Activate, deactivate or revoke loaded cryptographic keys.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reporting on activity, status and error of a point of interaction."</li>
	 * </ul>
	 */
	public static final MMCode Reporting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Reporting on activity, status and error of a point of interaction.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters for the TMS protocol."</li>
	 * </ul>
	 */
	public static final MMCode TMSProtocolParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			definition = "Configuration parameters for the TMS protocol.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMProtocol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ATM protocol parameters, including the configuration of the hosts."</li>
	 * </ul>
	 */
	public static final MMCode ATMProtocol = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMProtocol";
			definition = "ATM protocol parameters, including the configuration of the hosts.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters of the ATM."</li>
	 * </ul>
	 */
	public static final MMCode ATMConfiguration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMConfiguration";
			definition = "Configuration parameters of the ATM.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardApplication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters of the card application."</li>
	 * </ul>
	 */
	public static final MMCode CardApplication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardApplication";
			definition = "Configuration parameters of the card application.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of the cards accepted by the terminal."</li>
	 * </ul>
	 */
	public static final MMCode CardConfiguration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardConfiguration";
			definition = "Configuration of the cards accepted by the terminal.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local rates for currency exchanges."</li>
	 * </ul>
	 */
	public static final MMCode OfflineExchangeRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineExchangeRate";
			definition = "Local rates for currency exchanges.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreDefinedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Predefined amounts to be presented to the customer."</li>
	 * </ul>
	 */
	public static final MMCode PreDefinedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreDefinedAmount";
			definition = "Predefined amounts to be presented to the customer.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocationConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of the location."</li>
	 * </ul>
	 */
	public static final MMCode LocationConfiguration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocationConfiguration";
			definition = "Configuration of the location.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobileOperator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration of the mobile operator cards accepted by the terminal."</li>
	 * </ul>
	 */
	public static final MMCode MobileOperator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobileOperator";
			definition = "Configuration of the mobile operator cards accepted by the terminal.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Batch of transaction that have generated an error in the totals of the reconciliation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ReconciliationError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationError";
			definition = "Batch of transaction that have generated an error in the totals of the reconciliation.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate provided by a terminal manager."</li>
	 * </ul>
	 */
	public static final MMCode CertificateParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			definition = "Certificate provided by a terminal manager.";
			owner_lazy = () -> DataSetCategoryCode.mmObject();
			codeName = "CRTF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SWPK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DataSetCategoryCode";
				definition = "Category of data set to transfer.";
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
						com.tools20022.repository.codeset.DataSetCategoryCode.ReconciliationError, com.tools20022.repository.codeset.DataSetCategoryCode.CertificateParameters);
				derivation_lazy = () -> Arrays.asList(DataSetCategory2Code.mmObject(), DataSetCategory3Code.mmObject(), DataSetCategory1Code.mmObject(), DataSetCategory5Code.mmObject(), DataSetCategory6Code.mmObject(),
						DataSetCategory4Code.mmObject(), DataSetCategory7Code.mmObject(), DataSetCategory9Code.mmObject(), DataSetCategory10Code.mmObject(), DataSetCategory8Code.mmObject(), DataSetCategory11Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}