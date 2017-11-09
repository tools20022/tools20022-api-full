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
import com.tools20022.repository.codeset.SystemEventTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a type of event related to a system's operation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
 * SystemEventTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmLVPCutOff
 * SystemEventType2Code.mmLVPCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmLVPCancellationCutOff
 * SystemEventType2Code.mmLVPCancellationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmLVPCutOffReportTime
 * SystemEventType2Code.mmLVPCutOffReportTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmEuro1StartUp
 * SystemEventType2Code.mmEuro1StartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmStep1StartUp
 * SystemEventType2Code.mmStep1StartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmLimitWarningStartUp
 * SystemEventType2Code.mmLimitWarningStartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmEuro1CutOff
 * SystemEventType2Code.mmEuro1CutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmFinalReporting
 * SystemEventType2Code.mmFinalReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmStartOfDay
 * SystemEventType2Code.mmStartOfDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmLTNCutOff
 * SystemEventType2Code.mmLTNCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmCashReservationCutOff
 * SystemEventType2Code.mmCashReservationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmRecCutOff
 * SystemEventType2Code.mmRecCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmLTGCutOff
 * SystemEventType2Code.mmLTGCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmLTDCutOff
 * SystemEventType2Code.mmLTDCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmCustomerCutOff
 * SystemEventType2Code.mmCustomerCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmInterbankCutOff
 * SystemEventType2Code.mmInterbankCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmSystemCutOff
 * SystemEventType2Code.mmSystemCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmNetSSSReservationCutOff
 * SystemEventType2Code.mmNetSSSReservationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmResumeOperation
 * SystemEventType2Code.mmResumeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmProcessingCutOffTime
 * SystemEventType2Code.mmProcessingCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmNewPaymentCutOffTime
 * SystemEventType2Code.mmNewPaymentCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#mmEndOfStandingFacilities
 * SystemEventType2Code.mmEndOfStandingFacilities}</li>
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
 * "SystemEventType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of event related to a system's operation."</li>
 * </ul>
 */
public class SystemEventType2Code extends SystemEventTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LVPCutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmLVPCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LVPCutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LVPCancellationCutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmLVPCancellationCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LVPCancellationCutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LVPCutOffReportTime"</li>
	 * </ul>
	 */
	public static final MMCode mmLVPCutOffReportTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LVPCutOffReportTime";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Euro1StartUp"</li>
	 * </ul>
	 */
	public static final MMCode mmEuro1StartUp = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Euro1StartUp";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Step1StartUp"</li>
	 * </ul>
	 */
	public static final MMCode mmStep1StartUp = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Step1StartUp";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitWarningStartUp"</li>
	 * </ul>
	 */
	public static final MMCode mmLimitWarningStartUp = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitWarningStartUp";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Euro1CutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmEuro1CutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Euro1CutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalReporting"</li>
	 * </ul>
	 */
	public static final MMCode mmFinalReporting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalReporting";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartOfDay"</li>
	 * </ul>
	 */
	public static final MMCode mmStartOfDay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartOfDay";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LTNCutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmLTNCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LTNCutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashReservationCutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmCashReservationCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashReservationCutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecCutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmRecCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecCutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LTGCutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmLTGCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LTGCutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LTDCutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmLTDCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LTDCutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmCustomerCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankCutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmInterbankCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankCutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemCutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmSystemCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemCutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetSSSReservationCutOff"</li>
	 * </ul>
	 */
	public static final MMCode mmNetSSSReservationCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSSSReservationCutOff";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResumeOperation"</li>
	 * </ul>
	 */
	public static final MMCode mmResumeOperation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResumeOperation";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingCutOffTime"</li>
	 * </ul>
	 */
	public static final MMCode mmProcessingCutOffTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingCutOffTime";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPaymentCutOffTime"</li>
	 * </ul>
	 */
	public static final MMCode mmNewPaymentCutOffTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPaymentCutOffTime";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfStandingFacilities"</li>
	 * </ul>
	 */
	public static final MMCode mmEndOfStandingFacilities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfStandingFacilities";
			owner_lazy = () -> SystemEventType2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LVCO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemEventType2Code";
				definition = "Specifies a type of event related to a system's operation.";
				code_lazy = () -> Arrays.asList(SystemEventType2Code.mmLVPCutOff, SystemEventType2Code.mmLVPCancellationCutOff, SystemEventType2Code.mmLVPCutOffReportTime, SystemEventType2Code.mmEuro1StartUp,
						SystemEventType2Code.mmStep1StartUp, SystemEventType2Code.mmLimitWarningStartUp, SystemEventType2Code.mmEuro1CutOff, SystemEventType2Code.mmFinalReporting, SystemEventType2Code.mmStartOfDay,
						SystemEventType2Code.mmLTNCutOff, SystemEventType2Code.mmCashReservationCutOff, SystemEventType2Code.mmRecCutOff, SystemEventType2Code.mmLTGCutOff, SystemEventType2Code.mmLTDCutOff,
						SystemEventType2Code.mmCustomerCutOff, SystemEventType2Code.mmInterbankCutOff, SystemEventType2Code.mmSystemCutOff, SystemEventType2Code.mmNetSSSReservationCutOff, SystemEventType2Code.mmResumeOperation,
						SystemEventType2Code.mmProcessingCutOffTime, SystemEventType2Code.mmNewPaymentCutOffTime, SystemEventType2Code.mmEndOfStandingFacilities);
				trace_lazy = () -> SystemEventTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}