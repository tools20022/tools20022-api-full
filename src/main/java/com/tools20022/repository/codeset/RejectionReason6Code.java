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
import com.tools20022.repository.codeset.RejectionReason6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of a rejection of the notification advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#FailedValidation
 * RejectionReason6Code.FailedValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#MissingOption
 * RejectionReason6Code.MissingOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#NotDefinedAgent
 * RejectionReason6Code.NotDefinedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#MissingPeriodEndDate
 * RejectionReason6Code.MissingPeriodEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#MissingPeriodStartDate
 * RejectionReason6Code.MissingPeriodStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#MissingResultingAmount
 * RejectionReason6Code.MissingResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#WrongSecurityType
 * RejectionReason6Code.WrongSecurityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#NotEligibleDisperseSecurity
 * RejectionReason6Code.NotEligibleDisperseSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#NonEligibleSecurity
 * RejectionReason6Code.NonEligibleSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#MissingExchangeRate
 * RejectionReason6Code.MissingExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#ValueDateBeforePaymentDate
 * RejectionReason6Code.ValueDateBeforePaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#UnexpectedAccruedInterest
 * RejectionReason6Code.UnexpectedAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#NoAccessToService
 * RejectionReason6Code.NoAccessToService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#MissingCertification
 * RejectionReason6Code.MissingCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#NotBusinessDay
 * RejectionReason6Code.NotBusinessDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#EffectiveDayAfterPaymentDate
 * RejectionReason6Code.EffectiveDayAfterPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#GrossAmountLessThanNetAmount
 * RejectionReason6Code.GrossAmountLessThanNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#MissingDefaultOption
 * RejectionReason6Code.MissingDefaultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#NonActiveParty
 * RejectionReason6Code.NonActiveParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#PeriodEndDateBeforeStartDate
 * RejectionReason6Code.PeriodEndDateBeforeStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code#RecordDateAfterPaymentDate
 * RejectionReason6Code.RecordDateAfterPaymentDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
 * RejectionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FAIL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of a rejection of the notification advice."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedValidation"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code FailedValidation = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.FailedValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOption"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code MissingOption = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOption";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.MissingOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotDefinedAgent"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code NotDefinedAgent = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDefinedAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.NotDefinedAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingPeriodEndDate"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code MissingPeriodEndDate = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingPeriodEndDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.MissingPeriodEndDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingPeriodStartDate"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code MissingPeriodStartDate = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingPeriodStartDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.MissingPeriodStartDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingResultingAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code MissingResultingAmount = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingResultingAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.MissingResultingAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongSecurityType"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code WrongSecurityType = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSecurityType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.WrongSecurityType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleDisperseSecurity"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code NotEligibleDisperseSecurity = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEligibleDisperseSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.NotEligibleDisperseSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleSecurity"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code NonEligibleSecurity = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.NonEligibleSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingExchangeRate"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code MissingExchangeRate = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingExchangeRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.MissingExchangeRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateBeforePaymentDate"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code ValueDateBeforePaymentDate = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateBeforePaymentDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.ValueDateBeforePaymentDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnexpectedAccruedInterest"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code UnexpectedAccruedInterest = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnexpectedAccruedInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.UnexpectedAccruedInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccessToService"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code NoAccessToService = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccessToService";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.NoAccessToService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCertification"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code MissingCertification = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.MissingCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotBusinessDay"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code NotBusinessDay = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotBusinessDay";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.NotBusinessDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDayAfterPaymentDate"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code EffectiveDayAfterPaymentDate = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDayAfterPaymentDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.EffectiveDayAfterPaymentDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmountLessThanNetAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code GrossAmountLessThanNetAmount = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmountLessThanNetAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.GrossAmountLessThanNetAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDefaultOption"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code MissingDefaultOption = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDefaultOption";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.MissingDefaultOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonActiveParty"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code NonActiveParty = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonActiveParty";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.NonActiveParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodEndDateBeforeStartDate"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code PeriodEndDateBeforeStartDate = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodEndDateBeforeStartDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.PeriodEndDateBeforeStartDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason6Code
	 * RejectionReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDateAfterPaymentDate"</li>
	 * </ul>
	 */
	public static final RejectionReason6Code RecordDateAfterPaymentDate = new RejectionReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDateAfterPaymentDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason6Code.mmObject();
			codeName = RejectionReasonCode.RecordDateAfterPaymentDate.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason6Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FAIL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason6Code";
				definition = "Specifies the reason of a rejection of the notification advice.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason6Code.FailedValidation, com.tools20022.repository.codeset.RejectionReason6Code.MissingOption,
						com.tools20022.repository.codeset.RejectionReason6Code.NotDefinedAgent, com.tools20022.repository.codeset.RejectionReason6Code.MissingPeriodEndDate,
						com.tools20022.repository.codeset.RejectionReason6Code.MissingPeriodStartDate, com.tools20022.repository.codeset.RejectionReason6Code.MissingResultingAmount,
						com.tools20022.repository.codeset.RejectionReason6Code.WrongSecurityType, com.tools20022.repository.codeset.RejectionReason6Code.NotEligibleDisperseSecurity,
						com.tools20022.repository.codeset.RejectionReason6Code.NonEligibleSecurity, com.tools20022.repository.codeset.RejectionReason6Code.MissingExchangeRate,
						com.tools20022.repository.codeset.RejectionReason6Code.ValueDateBeforePaymentDate, com.tools20022.repository.codeset.RejectionReason6Code.UnexpectedAccruedInterest,
						com.tools20022.repository.codeset.RejectionReason6Code.NoAccessToService, com.tools20022.repository.codeset.RejectionReason6Code.MissingCertification,
						com.tools20022.repository.codeset.RejectionReason6Code.NotBusinessDay, com.tools20022.repository.codeset.RejectionReason6Code.EffectiveDayAfterPaymentDate,
						com.tools20022.repository.codeset.RejectionReason6Code.GrossAmountLessThanNetAmount, com.tools20022.repository.codeset.RejectionReason6Code.MissingDefaultOption,
						com.tools20022.repository.codeset.RejectionReason6Code.NonActiveParty, com.tools20022.repository.codeset.RejectionReason6Code.PeriodEndDateBeforeStartDate,
						com.tools20022.repository.codeset.RejectionReason6Code.RecordDateAfterPaymentDate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FailedValidation.getCodeName().get(), FailedValidation);
		codesByName.put(MissingOption.getCodeName().get(), MissingOption);
		codesByName.put(NotDefinedAgent.getCodeName().get(), NotDefinedAgent);
		codesByName.put(MissingPeriodEndDate.getCodeName().get(), MissingPeriodEndDate);
		codesByName.put(MissingPeriodStartDate.getCodeName().get(), MissingPeriodStartDate);
		codesByName.put(MissingResultingAmount.getCodeName().get(), MissingResultingAmount);
		codesByName.put(WrongSecurityType.getCodeName().get(), WrongSecurityType);
		codesByName.put(NotEligibleDisperseSecurity.getCodeName().get(), NotEligibleDisperseSecurity);
		codesByName.put(NonEligibleSecurity.getCodeName().get(), NonEligibleSecurity);
		codesByName.put(MissingExchangeRate.getCodeName().get(), MissingExchangeRate);
		codesByName.put(ValueDateBeforePaymentDate.getCodeName().get(), ValueDateBeforePaymentDate);
		codesByName.put(UnexpectedAccruedInterest.getCodeName().get(), UnexpectedAccruedInterest);
		codesByName.put(NoAccessToService.getCodeName().get(), NoAccessToService);
		codesByName.put(MissingCertification.getCodeName().get(), MissingCertification);
		codesByName.put(NotBusinessDay.getCodeName().get(), NotBusinessDay);
		codesByName.put(EffectiveDayAfterPaymentDate.getCodeName().get(), EffectiveDayAfterPaymentDate);
		codesByName.put(GrossAmountLessThanNetAmount.getCodeName().get(), GrossAmountLessThanNetAmount);
		codesByName.put(MissingDefaultOption.getCodeName().get(), MissingDefaultOption);
		codesByName.put(NonActiveParty.getCodeName().get(), NonActiveParty);
		codesByName.put(PeriodEndDateBeforeStartDate.getCodeName().get(), PeriodEndDateBeforeStartDate);
		codesByName.put(RecordDateAfterPaymentDate.getCodeName().get(), RecordDateAfterPaymentDate);
	}

	public static RejectionReason6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason6Code[] values() {
		RejectionReason6Code[] values = new RejectionReason6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason6Code> {
		@Override
		public RejectionReason6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}