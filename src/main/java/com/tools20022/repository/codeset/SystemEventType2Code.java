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
import com.tools20022.repository.codeset.SystemEventType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a type of event related to a system's operation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#LVPCutOff
 * SystemEventType2Code.LVPCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#LVPCancellationCutOff
 * SystemEventType2Code.LVPCancellationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#LVPCutOffReportTime
 * SystemEventType2Code.LVPCutOffReportTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#Euro1StartUp
 * SystemEventType2Code.Euro1StartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#Step1StartUp
 * SystemEventType2Code.Step1StartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#LimitWarningStartUp
 * SystemEventType2Code.LimitWarningStartUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#Euro1CutOff
 * SystemEventType2Code.Euro1CutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#FinalReporting
 * SystemEventType2Code.FinalReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#StartOfDay
 * SystemEventType2Code.StartOfDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#LTNCutOff
 * SystemEventType2Code.LTNCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#CashReservationCutOff
 * SystemEventType2Code.CashReservationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#RecCutOff
 * SystemEventType2Code.RecCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#LTGCutOff
 * SystemEventType2Code.LTGCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#LTDCutOff
 * SystemEventType2Code.LTDCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#CustomerCutOff
 * SystemEventType2Code.CustomerCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#InterbankCutOff
 * SystemEventType2Code.InterbankCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#SystemCutOff
 * SystemEventType2Code.SystemCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#NetSSSReservationCutOff
 * SystemEventType2Code.NetSSSReservationCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#ResumeOperation
 * SystemEventType2Code.ResumeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#ProcessingCutOffTime
 * SystemEventType2Code.ProcessingCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#NewPaymentCutOffTime
 * SystemEventType2Code.NewPaymentCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code#EndOfStandingFacilities
 * SystemEventType2Code.EndOfStandingFacilities}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
 * SystemEventTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemEventType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of event related to a system's operation."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SystemEventType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventType2Code
	 * SystemEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LVPCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code LVPCutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LVPCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.LVPCutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LVPCancellationCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code LVPCancellationCutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LVPCancellationCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.LVPCancellationCutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LVPCutOffReportTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code LVPCutOffReportTime = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LVPCutOffReportTime";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.LVPCutOffReportTime.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Euro1StartUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code Euro1StartUp = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Euro1StartUp";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.Euro1StartUp.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Step1StartUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code Step1StartUp = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Step1StartUp";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.Step1StartUp.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitWarningStartUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code LimitWarningStartUp = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitWarningStartUp";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.LimitWarningStartUp.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Euro1CutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code Euro1CutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Euro1CutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.Euro1CutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code FinalReporting = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalReporting";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.FinalReporting.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartOfDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code StartOfDay = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartOfDay";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.StartOfDay.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LTNCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code LTNCutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LTNCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.LTNCutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashReservationCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code CashReservationCutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashReservationCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.CashReservationCutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code RecCutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.RecCutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LTGCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code LTGCutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LTGCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.LTGCutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LTDCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code LTDCutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LTDCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.LTDCutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code CustomerCutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.CustomerCutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code InterbankCutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.InterbankCutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code SystemCutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.SystemCutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetSSSReservationCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code NetSSSReservationCutOff = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSSSReservationCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.NetSSSReservationCutOff.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResumeOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code ResumeOperation = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResumeOperation";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.ResumeOperation.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingCutOffTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code ProcessingCutOffTime = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingCutOffTime";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.ProcessingCutOffTime.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPaymentCutOffTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code NewPaymentCutOffTime = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPaymentCutOffTime";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.NewPaymentCutOffTime.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfStandingFacilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemEventType2Code EndOfStandingFacilities = new SystemEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfStandingFacilities";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemEventType2Code.mmObject();
			codeName = SystemEventTypeCode.EndOfStandingFacilities.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SystemEventType2Code> codesByName = new LinkedHashMap<>();

	protected SystemEventType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LVCO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemEventType2Code";
				definition = "Specifies a type of event related to a system's operation.";
				trace_lazy = () -> SystemEventTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemEventType2Code.LVPCutOff, com.tools20022.repository.codeset.SystemEventType2Code.LVPCancellationCutOff,
						com.tools20022.repository.codeset.SystemEventType2Code.LVPCutOffReportTime, com.tools20022.repository.codeset.SystemEventType2Code.Euro1StartUp, com.tools20022.repository.codeset.SystemEventType2Code.Step1StartUp,
						com.tools20022.repository.codeset.SystemEventType2Code.LimitWarningStartUp, com.tools20022.repository.codeset.SystemEventType2Code.Euro1CutOff, com.tools20022.repository.codeset.SystemEventType2Code.FinalReporting,
						com.tools20022.repository.codeset.SystemEventType2Code.StartOfDay, com.tools20022.repository.codeset.SystemEventType2Code.LTNCutOff, com.tools20022.repository.codeset.SystemEventType2Code.CashReservationCutOff,
						com.tools20022.repository.codeset.SystemEventType2Code.RecCutOff, com.tools20022.repository.codeset.SystemEventType2Code.LTGCutOff, com.tools20022.repository.codeset.SystemEventType2Code.LTDCutOff,
						com.tools20022.repository.codeset.SystemEventType2Code.CustomerCutOff, com.tools20022.repository.codeset.SystemEventType2Code.InterbankCutOff, com.tools20022.repository.codeset.SystemEventType2Code.SystemCutOff,
						com.tools20022.repository.codeset.SystemEventType2Code.NetSSSReservationCutOff, com.tools20022.repository.codeset.SystemEventType2Code.ResumeOperation,
						com.tools20022.repository.codeset.SystemEventType2Code.ProcessingCutOffTime, com.tools20022.repository.codeset.SystemEventType2Code.NewPaymentCutOffTime,
						com.tools20022.repository.codeset.SystemEventType2Code.EndOfStandingFacilities);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LVPCutOff.getCodeName().get(), LVPCutOff);
		codesByName.put(LVPCancellationCutOff.getCodeName().get(), LVPCancellationCutOff);
		codesByName.put(LVPCutOffReportTime.getCodeName().get(), LVPCutOffReportTime);
		codesByName.put(Euro1StartUp.getCodeName().get(), Euro1StartUp);
		codesByName.put(Step1StartUp.getCodeName().get(), Step1StartUp);
		codesByName.put(LimitWarningStartUp.getCodeName().get(), LimitWarningStartUp);
		codesByName.put(Euro1CutOff.getCodeName().get(), Euro1CutOff);
		codesByName.put(FinalReporting.getCodeName().get(), FinalReporting);
		codesByName.put(StartOfDay.getCodeName().get(), StartOfDay);
		codesByName.put(LTNCutOff.getCodeName().get(), LTNCutOff);
		codesByName.put(CashReservationCutOff.getCodeName().get(), CashReservationCutOff);
		codesByName.put(RecCutOff.getCodeName().get(), RecCutOff);
		codesByName.put(LTGCutOff.getCodeName().get(), LTGCutOff);
		codesByName.put(LTDCutOff.getCodeName().get(), LTDCutOff);
		codesByName.put(CustomerCutOff.getCodeName().get(), CustomerCutOff);
		codesByName.put(InterbankCutOff.getCodeName().get(), InterbankCutOff);
		codesByName.put(SystemCutOff.getCodeName().get(), SystemCutOff);
		codesByName.put(NetSSSReservationCutOff.getCodeName().get(), NetSSSReservationCutOff);
		codesByName.put(ResumeOperation.getCodeName().get(), ResumeOperation);
		codesByName.put(ProcessingCutOffTime.getCodeName().get(), ProcessingCutOffTime);
		codesByName.put(NewPaymentCutOffTime.getCodeName().get(), NewPaymentCutOffTime);
		codesByName.put(EndOfStandingFacilities.getCodeName().get(), EndOfStandingFacilities);
	}

	public static SystemEventType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SystemEventType2Code[] values() {
		SystemEventType2Code[] values = new SystemEventType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SystemEventType2Code> {
		@Override
		public SystemEventType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SystemEventType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}