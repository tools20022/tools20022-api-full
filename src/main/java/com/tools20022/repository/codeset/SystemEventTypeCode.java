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
 * Specifies a type of event related to a system's operation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmLVPCutOff
 * SystemEventTypeCode.mmLVPCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmLVPCancellationCutOff
 * SystemEventTypeCode.mmLVPCancellationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmLVPCutOffReportTime
 * SystemEventTypeCode.mmLVPCutOffReportTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmEuro1StartUp
 * SystemEventTypeCode.mmEuro1StartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmStep1StartUp
 * SystemEventTypeCode.mmStep1StartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmLimitWarningStartUp
 * SystemEventTypeCode.mmLimitWarningStartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmEuro1CutOff
 * SystemEventTypeCode.mmEuro1CutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmFinalReporting
 * SystemEventTypeCode.mmFinalReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmStartOfDay
 * SystemEventTypeCode.mmStartOfDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmLTNCutOff
 * SystemEventTypeCode.mmLTNCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmCashReservationCutOff
 * SystemEventTypeCode.mmCashReservationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmRecCutOff
 * SystemEventTypeCode.mmRecCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmLTGCutOff
 * SystemEventTypeCode.mmLTGCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmLTDCutOff
 * SystemEventTypeCode.mmLTDCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmCustomerCutOff
 * SystemEventTypeCode.mmCustomerCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmInterbankCutOff
 * SystemEventTypeCode.mmInterbankCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmSystemCutOff
 * SystemEventTypeCode.mmSystemCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmNetSSSReservationCutOff
 * SystemEventTypeCode.mmNetSSSReservationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmResumeOperation
 * SystemEventTypeCode.mmResumeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmProcessingCutOffTime
 * SystemEventTypeCode.mmProcessingCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmNewPaymentCutOffTime
 * SystemEventTypeCode.mmNewPaymentCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#mmEndOfStandingFacilities
 * SystemEventTypeCode.mmEndOfStandingFacilities}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SystemEventType2Code
 * SystemEventType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LVCO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemEventTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of event related to a system's operation."</li>
 * </ul>
 */
public class SystemEventTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event is the cutoff time for low value payments processed by the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LVPCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the cutoff time for low value payments processed by the system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLVPCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LVPCutOff";
			definition = "Event is the cutoff time for low value payments processed by the system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LVCO";
		}
	};
	/**
	 * Event is the cutoff time after which low value payments can no longer be
	 * cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LVPCancellationCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the cutoff time after which low value payments can no longer be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLVPCancellationCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LVPCancellationCutOff";
			definition = "Event is the cutoff time after which low value payments can no longer be cancelled.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LVCC";
		}
	};
	/**
	 * Event is the time at which the members will be provided with the report
	 * corresponding to the processing of low value payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LVPCutOffReportTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the time at which the members will be provided with the report corresponding to the processing of low value payments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLVPCutOffReportTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LVPCutOffReportTime";
			definition = "Event is the time at which the members will be provided with the report corresponding to the processing of low value payments.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LVRT";
		}
	};
	/**
	 * Event is the opening of the Euro 1 system operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Euro1StartUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is the opening of the Euro 1 system operation."</li>
	 * </ul>
	 */
	public static final MMCode mmEuro1StartUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Euro1StartUp";
			definition = "Event is the opening of the Euro 1 system operation.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "EUSU";
		}
	};
	/**
	 * Event is the start of the Step 1 system operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Step1StartUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is the start of the Step 1 system operation."</li>
	 * </ul>
	 */
	public static final MMCode mmStep1StartUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Step1StartUp";
			definition = "Event is the start of the Step 1 system operation.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "STSU";
		}
	};
	/**
	 * Event is the start of the limit warning period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LWSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitWarningStartUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is the start of the limit warning period."</li>
	 * </ul>
	 */
	public static final MMCode mmLimitWarningStartUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitWarningStartUp";
			definition = "Event is the start of the limit warning period.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LWSU";
		}
	};
	/**
	 * Event is the cutoff time for the Euro1 system, ie, the deadline for
	 * processing Euro1 transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Euro1CutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the cutoff time for the Euro1 system, ie, the deadline for processing Euro1 transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEuro1CutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Euro1CutOff";
			definition = "Event is the cutoff time for the Euro1 system, ie, the deadline for processing Euro1 transactions.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "EUCO";
		}
	};
	/**
	 * Event is the report after all operations have ceased in the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the report after all operations have ceased in the system."</li>
	 * </ul>
	 */
	public static final MMCode mmFinalReporting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalReporting";
			definition = "Event is the report after all operations have ceased in the system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "FIRE";
		}
	};
	/**
	 * Event is the start of the operating day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STDY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartOfDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is the start of the operating day."</li>
	 * </ul>
	 */
	public static final MMCode mmStartOfDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StartOfDay";
			definition = "Event is the start of the operating day.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "STDY";
		}
	};
	/**
	 * Event is the cutoff for the settlement of the cash multilateral balances
	 * resulting from the overnight cycle of the securities settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTNC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LTNCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the cutoff for the settlement of the cash multilateral balances resulting from the overnight cycle of the securities settlement system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLTNCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LTNCutOff";
			definition = "Event is the cutoff for the settlement of the cash multilateral balances resulting from the overnight cycle of the securities settlement system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LTNC";
		}
	};
	/**
	 * Event is the cutoff for the cash reservation window.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashReservationCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is the cutoff for the cash reservation window."</li>
	 * </ul>
	 */
	public static final MMCode mmCashReservationCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashReservationCutOff";
			definition = "Event is the cutoff for the cash reservation window.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "CRCO";
		}
	};
	/**
	 * Event is the cutoff for the settlement of the multilateral balances
	 * stemming from the retail clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the cutoff for the settlement of the multilateral balances stemming from the retail clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRecCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecCutOff";
			definition = "Event is the cutoff for the settlement of the multilateral balances stemming from the retail clearing system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "RECC";
		}
	};
	/**
	 * Event is the cutoff for the daytime cycle of the securities settlement
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTGC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LTGCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the cutoff for the daytime cycle of the securities settlement system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLTGCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LTGCutOff";
			definition = "Event is the cutoff for the daytime cycle of the securities settlement system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LTGC";
		}
	};
	/**
	 * Event is the cutoff for the settlement of the cash multilateral balances
	 * resulting from the daylight cycle of the securities settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LTDCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the cutoff for the settlement of the cash multilateral balances resulting from the daylight cycle of the securities settlement system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLTDCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LTDCutOff";
			definition = "Event is the cutoff for the settlement of the cash multilateral balances resulting from the daylight cycle of the securities settlement system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LTDC";
		}
	};
	/**
	 * Event is the cutoff for customer payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is the cutoff for customer payments."</li>
	 * </ul>
	 */
	public static final MMCode mmCustomerCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerCutOff";
			definition = "Event is the cutoff for customer payments.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "CUSC";
		}
	};
	/**
	 * Event is the cutoff for interbank payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IBKC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is the cutoff for interbank payments."</li>
	 * </ul>
	 */
	public static final MMCode mmInterbankCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterbankCutOff";
			definition = "Event is the cutoff for interbank payments.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "IBKC";
		}
	};
	/**
	 * Event is the cutoff for the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is the cutoff for the system."</li>
	 * </ul>
	 */
	public static final MMCode mmSystemCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemCutOff";
			definition = "Event is the cutoff for the system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "SYSC";
		}
	};
	/**
	 * Event is the cutoff for the securities settlement system cash reservation
	 * window.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetSSSReservationCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the cutoff for the securities settlement system cash reservation window."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNetSSSReservationCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetSSSReservationCutOff";
			definition = "Event is the cutoff for the securities settlement system cash reservation window.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "SSSC";
		}
	};
	/**
	 * Event is the expected resume time for a TARGET component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResumeOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is the expected resume time for a TARGET component."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmResumeOperation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResumeOperation";
			definition = "Event is the expected resume time for a TARGET component.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "REOP";
		}
	};
	/**
	 * Event is the cutoff time for the processing of payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingCutOffTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is the cutoff time for the processing of payments."</li>
	 * </ul>
	 */
	public static final MMCode mmProcessingCutOffTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingCutOffTime";
			definition = "Event is the cutoff time for the processing of payments.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "PCOT";
		}
	};
	/**
	 * Event is the cutoff time for the receipt of new commercial payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPaymentCutOffTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the cutoff time for the receipt of new commercial payments."</li>
	 * </ul>
	 */
	public static final MMCode mmNewPaymentCutOffTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewPaymentCutOffTime";
			definition = "Event is the cutoff time for the receipt of new commercial payments.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "NPCT";
		}
	};
	/**
	 * Event is the cut off for the standing facilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESTF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfStandingFacilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is the cut off for the standing facilities."</li>
	 * </ul>
	 */
	public static final MMCode mmEndOfStandingFacilities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndOfStandingFacilities";
			definition = "Event is the cut off for the standing facilities.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "ESTF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("LVCO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemEventTypeCode";
				definition = "Specifies a type of event related to a system's operation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemEventTypeCode.mmLVPCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.mmLVPCancellationCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.mmLVPCutOffReportTime, com.tools20022.repository.codeset.SystemEventTypeCode.mmEuro1StartUp,
						com.tools20022.repository.codeset.SystemEventTypeCode.mmStep1StartUp, com.tools20022.repository.codeset.SystemEventTypeCode.mmLimitWarningStartUp, com.tools20022.repository.codeset.SystemEventTypeCode.mmEuro1CutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.mmFinalReporting, com.tools20022.repository.codeset.SystemEventTypeCode.mmStartOfDay, com.tools20022.repository.codeset.SystemEventTypeCode.mmLTNCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.mmCashReservationCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.mmRecCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.mmLTGCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.mmLTDCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.mmCustomerCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.mmInterbankCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.mmSystemCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.mmNetSSSReservationCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.mmResumeOperation, com.tools20022.repository.codeset.SystemEventTypeCode.mmProcessingCutOffTime,
						com.tools20022.repository.codeset.SystemEventTypeCode.mmNewPaymentCutOffTime, com.tools20022.repository.codeset.SystemEventTypeCode.mmEndOfStandingFacilities);
				derivation_lazy = () -> Arrays.asList(SystemEventType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}