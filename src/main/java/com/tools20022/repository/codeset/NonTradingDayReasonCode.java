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
import com.tools20022.repository.codeset.NonTradingDayReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason capturing a non trading day.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode#Other
 * NonTradingDayReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode#TradingHoliday
 * NonTradingDayReasonCode.TradingHoliday}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode#HalfDay
 * NonTradingDayReasonCode.HalfDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode#BankHoliday
 * NonTradingDayReasonCode.BankHoliday}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode#PublicHoliday
 * NonTradingDayReasonCode.PublicHoliday}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode#Weekend
 * NonTradingDayReasonCode.Weekend}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code
 * NonTradingDayReason1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonTradingDayReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason capturing a non trading day."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NonTradingDayReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Other reasons a day is a non-trading day e.g. technical fault, company
	 * specific non-trading day not known in advance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode
	 * NonTradingDayReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other reasons a day is a non-trading day e.g. technical fault, company specific non-trading day not known in advance."
	 * </li>
	 * </ul>
	 */
	public static final NonTradingDayReasonCode Other = new NonTradingDayReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other reasons a day is a non-trading day e.g. technical fault, company specific non-trading day not known in advance.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * The date is a full day trading holiday with no trades performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode
	 * NonTradingDayReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingHoliday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The date is a full day trading holiday with no trades performed."</li>
	 * </ul>
	 */
	public static final NonTradingDayReasonCode TradingHoliday = new NonTradingDayReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingHoliday";
			definition = "The date is a full day trading holiday with no trades performed.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReasonCode.mmObject();
			codeName = "THOL";
		}
	};
	/**
	 * Trading venue was open for an amount of time, up to half the day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode
	 * NonTradingDayReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HALF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HalfDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trading venue was open for an amount of time, up to half the day."</li>
	 * </ul>
	 */
	public static final NonTradingDayReasonCode HalfDay = new NonTradingDayReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HalfDay";
			definition = "Trading venue was open for an amount of time, up to half the day.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReasonCode.mmObject();
			codeName = "HALF";
		}
	};
	/**
	 * Date is a bank holiday.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode
	 * NonTradingDayReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BHOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankHoliday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date is a bank holiday."</li>
	 * </ul>
	 */
	public static final NonTradingDayReasonCode BankHoliday = new NonTradingDayReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankHoliday";
			definition = "Date is a bank holiday.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReasonCode.mmObject();
			codeName = "BHOL";
		}
	};
	/**
	 * Date is a public holiday.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode
	 * NonTradingDayReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicHoliday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date is a public holiday."</li>
	 * </ul>
	 */
	public static final NonTradingDayReasonCode PublicHoliday = new NonTradingDayReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicHoliday";
			definition = "Date is a public holiday.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReasonCode.mmObject();
			codeName = "PHOL";
		}
	};
	/**
	 * Date being reported falls during the weekend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode
	 * NonTradingDayReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WKND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date being reported falls during the weekend."</li>
	 * </ul>
	 */
	public static final NonTradingDayReasonCode Weekend = new NonTradingDayReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekend";
			definition = "Date being reported falls during the weekend.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReasonCode.mmObject();
			codeName = "WKND";
		}
	};
	final static private LinkedHashMap<String, NonTradingDayReasonCode> codesByName = new LinkedHashMap<>();

	protected NonTradingDayReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonTradingDayReasonCode";
				definition = "Specifies the reason capturing a non trading day.";
				derivation_lazy = () -> Arrays.asList(NonTradingDayReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NonTradingDayReasonCode.Other, com.tools20022.repository.codeset.NonTradingDayReasonCode.TradingHoliday,
						com.tools20022.repository.codeset.NonTradingDayReasonCode.HalfDay, com.tools20022.repository.codeset.NonTradingDayReasonCode.BankHoliday, com.tools20022.repository.codeset.NonTradingDayReasonCode.PublicHoliday,
						com.tools20022.repository.codeset.NonTradingDayReasonCode.Weekend);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(TradingHoliday.getCodeName().get(), TradingHoliday);
		codesByName.put(HalfDay.getCodeName().get(), HalfDay);
		codesByName.put(BankHoliday.getCodeName().get(), BankHoliday);
		codesByName.put(PublicHoliday.getCodeName().get(), PublicHoliday);
		codesByName.put(Weekend.getCodeName().get(), Weekend);
	}

	public static NonTradingDayReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NonTradingDayReasonCode[] values() {
		NonTradingDayReasonCode[] values = new NonTradingDayReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NonTradingDayReasonCode> {
		@Override
		public NonTradingDayReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NonTradingDayReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}