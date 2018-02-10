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
import com.tools20022.repository.codeset.TradeTransactionCondition5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the conditions under which the order/trade is to be/was executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition5Code#ExCoupon
 * TradeTransactionCondition5Code.ExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition5Code#CumCoupon
 * TradeTransactionCondition5Code.CumCoupon}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
 * TradeTransactionConditionCode}</li>
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
 * "TradeTransactionCondition5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be/was executed."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeTransactionCondition5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition5Code
	 * TradeTransactionCondition5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExCoupon"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition5Code ExCoupon = new TradeTransactionCondition5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition5Code.mmObject();
			codeName = TradeTransactionConditionCode.ExCoupon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition5Code
	 * TradeTransactionCondition5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumCoupon"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition5Code CumCoupon = new TradeTransactionCondition5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition5Code.mmObject();
			codeName = TradeTransactionConditionCode.CumCoupon.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeTransactionCondition5Code> codesByName = new LinkedHashMap<>();

	protected TradeTransactionCondition5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeTransactionCondition5Code";
				definition = "Specifies the conditions under which the order/trade is to be/was executed.";
				trace_lazy = () -> TradeTransactionConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeTransactionCondition5Code.ExCoupon, com.tools20022.repository.codeset.TradeTransactionCondition5Code.CumCoupon);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ExCoupon.getCodeName().get(), ExCoupon);
		codesByName.put(CumCoupon.getCodeName().get(), CumCoupon);
	}

	public static TradeTransactionCondition5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeTransactionCondition5Code[] values() {
		TradeTransactionCondition5Code[] values = new TradeTransactionCondition5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeTransactionCondition5Code> {
		@Override
		public TradeTransactionCondition5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeTransactionCondition5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}