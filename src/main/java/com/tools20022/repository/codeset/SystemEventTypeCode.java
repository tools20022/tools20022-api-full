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
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#LVPCutOff
 * SystemEventTypeCode.LVPCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#LVPCancellationCutOff
 * SystemEventTypeCode.LVPCancellationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#LVPCutOffReportTime
 * SystemEventTypeCode.LVPCutOffReportTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#Euro1StartUp
 * SystemEventTypeCode.Euro1StartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#Step1StartUp
 * SystemEventTypeCode.Step1StartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#LimitWarningStartUp
 * SystemEventTypeCode.LimitWarningStartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#Euro1CutOff
 * SystemEventTypeCode.Euro1CutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#FinalReporting
 * SystemEventTypeCode.FinalReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#StartOfDay
 * SystemEventTypeCode.StartOfDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#LTNCutOff
 * SystemEventTypeCode.LTNCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#CashReservationCutOff
 * SystemEventTypeCode.CashReservationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#RecCutOff
 * SystemEventTypeCode.RecCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#LTGCutOff
 * SystemEventTypeCode.LTGCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#LTDCutOff
 * SystemEventTypeCode.LTDCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#CustomerCutOff
 * SystemEventTypeCode.CustomerCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#InterbankCutOff
 * SystemEventTypeCode.InterbankCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#SystemCutOff
 * SystemEventTypeCode.SystemCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#NetSSSReservationCutOff
 * SystemEventTypeCode.NetSSSReservationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#ResumeOperation
 * SystemEventTypeCode.ResumeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#ProcessingCutOffTime
 * SystemEventTypeCode.ProcessingCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#NewPaymentCutOffTime
 * SystemEventTypeCode.NewPaymentCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode#EndOfStandingFacilities
 * SystemEventTypeCode.EndOfStandingFacilities}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	public static final MMCode LVPCutOff = new MMCode() {
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
	public static final MMCode LVPCancellationCutOff = new MMCode() {
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
	public static final MMCode LVPCutOffReportTime = new MMCode() {
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
	public static final MMCode Euro1StartUp = new MMCode() {
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
	public static final MMCode Step1StartUp = new MMCode() {
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
	public static final MMCode LimitWarningStartUp = new MMCode() {
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
	public static final MMCode Euro1CutOff = new MMCode() {
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
	public static final MMCode FinalReporting = new MMCode() {
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
	public static final MMCode StartOfDay = new MMCode() {
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
	public static final MMCode LTNCutOff = new MMCode() {
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
	public static final MMCode CashReservationCutOff = new MMCode() {
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
	public static final MMCode RecCutOff = new MMCode() {
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
	public static final MMCode LTGCutOff = new MMCode() {
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
	public static final MMCode LTDCutOff = new MMCode() {
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
	public static final MMCode CustomerCutOff = new MMCode() {
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
	public static final MMCode InterbankCutOff = new MMCode() {
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
	public static final MMCode SystemCutOff = new MMCode() {
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
	public static final MMCode NetSSSReservationCutOff = new MMCode() {
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
	public static final MMCode ResumeOperation = new MMCode() {
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
	public static final MMCode ProcessingCutOffTime = new MMCode() {
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
	public static final MMCode NewPaymentCutOffTime = new MMCode() {
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
	public static final MMCode EndOfStandingFacilities = new MMCode() {
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LVCO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemEventTypeCode";
				definition = "Specifies a type of event related to a system's operation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemEventTypeCode.LVPCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.LVPCancellationCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.LVPCutOffReportTime, com.tools20022.repository.codeset.SystemEventTypeCode.Euro1StartUp, com.tools20022.repository.codeset.SystemEventTypeCode.Step1StartUp,
						com.tools20022.repository.codeset.SystemEventTypeCode.LimitWarningStartUp, com.tools20022.repository.codeset.SystemEventTypeCode.Euro1CutOff, com.tools20022.repository.codeset.SystemEventTypeCode.FinalReporting,
						com.tools20022.repository.codeset.SystemEventTypeCode.StartOfDay, com.tools20022.repository.codeset.SystemEventTypeCode.LTNCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.CashReservationCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.RecCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.LTGCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.LTDCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.CustomerCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.InterbankCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.SystemCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.NetSSSReservationCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.ResumeOperation,
						com.tools20022.repository.codeset.SystemEventTypeCode.ProcessingCutOffTime, com.tools20022.repository.codeset.SystemEventTypeCode.NewPaymentCutOffTime,
						com.tools20022.repository.codeset.SystemEventTypeCode.EndOfStandingFacilities);
				derivation_lazy = () -> Arrays.asList(SystemEventType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}