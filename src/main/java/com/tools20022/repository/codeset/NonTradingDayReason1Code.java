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
import com.tools20022.repository.codeset.NonTradingDayReason1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code#TradingHoliday
 * NonTradingDayReason1Code.TradingHoliday}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code#Other
 * NonTradingDayReason1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code#HalfDay
 * NonTradingDayReason1Code.HalfDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code#PublicHoliday
 * NonTradingDayReason1Code.PublicHoliday}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code#BankHoliday
 * NonTradingDayReason1Code.BankHoliday}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code#Weekend
 * NonTradingDayReason1Code.Weekend}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReasonCode
 * NonTradingDayReasonCode}</li>
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
 * "NonTradingDayReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason capturing a non trading day."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NonTradingDayReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code
	 * NonTradingDayReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingHoliday"</li>
	 * </ul>
	 */
	public static final NonTradingDayReason1Code TradingHoliday = new NonTradingDayReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingHoliday";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReason1Code.mmObject();
			codeName = NonTradingDayReasonCode.TradingHoliday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code
	 * NonTradingDayReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final NonTradingDayReason1Code Other = new NonTradingDayReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReason1Code.mmObject();
			codeName = NonTradingDayReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code
	 * NonTradingDayReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HalfDay"</li>
	 * </ul>
	 */
	public static final NonTradingDayReason1Code HalfDay = new NonTradingDayReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HalfDay";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReason1Code.mmObject();
			codeName = NonTradingDayReasonCode.HalfDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code
	 * NonTradingDayReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicHoliday"</li>
	 * </ul>
	 */
	public static final NonTradingDayReason1Code PublicHoliday = new NonTradingDayReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicHoliday";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReason1Code.mmObject();
			codeName = NonTradingDayReasonCode.PublicHoliday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code
	 * NonTradingDayReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankHoliday"</li>
	 * </ul>
	 */
	public static final NonTradingDayReason1Code BankHoliday = new NonTradingDayReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankHoliday";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReason1Code.mmObject();
			codeName = NonTradingDayReasonCode.BankHoliday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code
	 * NonTradingDayReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekend"</li>
	 * </ul>
	 */
	public static final NonTradingDayReason1Code Weekend = new NonTradingDayReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekend";
			owner_lazy = () -> com.tools20022.repository.codeset.NonTradingDayReason1Code.mmObject();
			codeName = NonTradingDayReasonCode.Weekend.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NonTradingDayReason1Code> codesByName = new LinkedHashMap<>();

	protected NonTradingDayReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonTradingDayReason1Code";
				definition = "Specifies the reason capturing a non trading day.";
				trace_lazy = () -> NonTradingDayReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NonTradingDayReason1Code.TradingHoliday, com.tools20022.repository.codeset.NonTradingDayReason1Code.Other,
						com.tools20022.repository.codeset.NonTradingDayReason1Code.HalfDay, com.tools20022.repository.codeset.NonTradingDayReason1Code.PublicHoliday, com.tools20022.repository.codeset.NonTradingDayReason1Code.BankHoliday,
						com.tools20022.repository.codeset.NonTradingDayReason1Code.Weekend);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TradingHoliday.getCodeName().get(), TradingHoliday);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(HalfDay.getCodeName().get(), HalfDay);
		codesByName.put(PublicHoliday.getCodeName().get(), PublicHoliday);
		codesByName.put(BankHoliday.getCodeName().get(), BankHoliday);
		codesByName.put(Weekend.getCodeName().get(), Weekend);
	}

	public static NonTradingDayReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NonTradingDayReason1Code[] values() {
		NonTradingDayReason1Code[] values = new NonTradingDayReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NonTradingDayReason1Code> {
		@Override
		public NonTradingDayReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NonTradingDayReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}