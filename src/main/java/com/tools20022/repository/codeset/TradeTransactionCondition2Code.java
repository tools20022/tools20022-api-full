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
import com.tools20022.repository.codeset.TradeTransactionCondition2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the conditions under which the order/trade is to be executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#SpecialCumCoupon
 * TradeTransactionCondition2Code.SpecialCumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#SpecialExCoupon
 * TradeTransactionCondition2Code.SpecialExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#SpecialExBonus
 * TradeTransactionCondition2Code.SpecialExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#SpecialCumBonus
 * TradeTransactionCondition2Code.SpecialCumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#SpecialCumRights
 * TradeTransactionCondition2Code.SpecialCumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#SpecialExRights
 * TradeTransactionCondition2Code.SpecialExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#SpecialCumCapitalRepayments
 * TradeTransactionCondition2Code.SpecialCumCapitalRepayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#SpecialExCapitalRepayments
 * TradeTransactionCondition2Code.SpecialExCapitalRepayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#CashSettlement
 * TradeTransactionCondition2Code.CashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#SpecialPrice
 * TradeTransactionCondition2Code.SpecialPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#SpecialCumDividend
 * TradeTransactionCondition2Code.SpecialCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#SpecialExDividend
 * TradeTransactionCondition2Code.SpecialExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code#GuaranteedDelivery
 * TradeTransactionCondition2Code.GuaranteedDelivery}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SPCC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeTransactionCondition2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be executed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeTransactionCondition2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumCoupon"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code SpecialCumCoupon = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumCoupon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExCoupon"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code SpecialExCoupon = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExCoupon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExBonus"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code SpecialExBonus = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExBonus";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExBonus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumBonus"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code SpecialCumBonus = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumBonus";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumBonus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumRights"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code SpecialCumRights = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumRights";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExRights"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code SpecialExRights = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExRights";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumCapitalRepayments"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code SpecialCumCapitalRepayments = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumCapitalRepayments";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumCapitalRepayments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExCapitalRepayments"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code SpecialExCapitalRepayments = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExCapitalRepayments";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExCapitalRepayments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code CashSettlement = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.CashSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialPrice"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code SpecialPrice = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumDividend"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code SpecialCumDividend = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDividend"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code SpecialExDividend = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedDelivery"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition2Code GuaranteedDelivery = new TradeTransactionCondition2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition2Code.mmObject();
			codeName = TradeTransactionConditionCode.GuaranteedDelivery.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeTransactionCondition2Code> codesByName = new LinkedHashMap<>();

	protected TradeTransactionCondition2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SPCC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeTransactionCondition2Code";
				definition = "Specifies the conditions under which the order/trade is to be executed.";
				trace_lazy = () -> TradeTransactionConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeTransactionCondition2Code.SpecialCumCoupon, com.tools20022.repository.codeset.TradeTransactionCondition2Code.SpecialExCoupon,
						com.tools20022.repository.codeset.TradeTransactionCondition2Code.SpecialExBonus, com.tools20022.repository.codeset.TradeTransactionCondition2Code.SpecialCumBonus,
						com.tools20022.repository.codeset.TradeTransactionCondition2Code.SpecialCumRights, com.tools20022.repository.codeset.TradeTransactionCondition2Code.SpecialExRights,
						com.tools20022.repository.codeset.TradeTransactionCondition2Code.SpecialCumCapitalRepayments, com.tools20022.repository.codeset.TradeTransactionCondition2Code.SpecialExCapitalRepayments,
						com.tools20022.repository.codeset.TradeTransactionCondition2Code.CashSettlement, com.tools20022.repository.codeset.TradeTransactionCondition2Code.SpecialPrice,
						com.tools20022.repository.codeset.TradeTransactionCondition2Code.SpecialCumDividend, com.tools20022.repository.codeset.TradeTransactionCondition2Code.SpecialExDividend,
						com.tools20022.repository.codeset.TradeTransactionCondition2Code.GuaranteedDelivery);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SpecialCumCoupon.getCodeName().get(), SpecialCumCoupon);
		codesByName.put(SpecialExCoupon.getCodeName().get(), SpecialExCoupon);
		codesByName.put(SpecialExBonus.getCodeName().get(), SpecialExBonus);
		codesByName.put(SpecialCumBonus.getCodeName().get(), SpecialCumBonus);
		codesByName.put(SpecialCumRights.getCodeName().get(), SpecialCumRights);
		codesByName.put(SpecialExRights.getCodeName().get(), SpecialExRights);
		codesByName.put(SpecialCumCapitalRepayments.getCodeName().get(), SpecialCumCapitalRepayments);
		codesByName.put(SpecialExCapitalRepayments.getCodeName().get(), SpecialExCapitalRepayments);
		codesByName.put(CashSettlement.getCodeName().get(), CashSettlement);
		codesByName.put(SpecialPrice.getCodeName().get(), SpecialPrice);
		codesByName.put(SpecialCumDividend.getCodeName().get(), SpecialCumDividend);
		codesByName.put(SpecialExDividend.getCodeName().get(), SpecialExDividend);
		codesByName.put(GuaranteedDelivery.getCodeName().get(), GuaranteedDelivery);
	}

	public static TradeTransactionCondition2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeTransactionCondition2Code[] values() {
		TradeTransactionCondition2Code[] values = new TradeTransactionCondition2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeTransactionCondition2Code> {
		@Override
		public TradeTransactionCondition2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeTransactionCondition2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}