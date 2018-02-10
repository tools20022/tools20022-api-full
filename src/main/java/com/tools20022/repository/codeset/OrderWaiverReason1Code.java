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
import com.tools20022.repository.codeset.OrderWaiverReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Relates to non-standard orders, to handle them differently, probably in a
 * manual fashion.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReason1Code#LateTradeDealing
 * OrderWaiverReason1Code.LateTradeDealing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReason1Code#FrontEndLoadCharge
 * OrderWaiverReason1Code.FrontEndLoadCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReason1Code#BelowMinimumInvestmentAmount
 * OrderWaiverReason1Code.BelowMinimumInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReason1Code#CutOffDate
 * OrderWaiverReason1Code.CutOffDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReason1Code#CommissionWaiver
 * OrderWaiverReason1Code.CommissionWaiver}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode
 * OrderWaiverReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LATE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderWaiverReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Relates to non-standard orders, to handle them differently, probably in a manual fashion."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderWaiverReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReason1Code
	 * OrderWaiverReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateTradeDealing"</li>
	 * </ul>
	 */
	public static final OrderWaiverReason1Code LateTradeDealing = new OrderWaiverReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateTradeDealing";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderWaiverReason1Code.mmObject();
			codeName = OrderWaiverReasonCode.LateTradeDealing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReason1Code
	 * OrderWaiverReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoadCharge"</li>
	 * </ul>
	 */
	public static final OrderWaiverReason1Code FrontEndLoadCharge = new OrderWaiverReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoadCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderWaiverReason1Code.mmObject();
			codeName = OrderWaiverReasonCode.FrontEndLoadCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReason1Code
	 * OrderWaiverReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumInvestmentAmount"</li>
	 * </ul>
	 */
	public static final OrderWaiverReason1Code BelowMinimumInvestmentAmount = new OrderWaiverReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInvestmentAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderWaiverReason1Code.mmObject();
			codeName = OrderWaiverReasonCode.BelowMinimumInvestmentAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReason1Code
	 * OrderWaiverReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffDate"</li>
	 * </ul>
	 */
	public static final OrderWaiverReason1Code CutOffDate = new OrderWaiverReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffDate";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderWaiverReason1Code.mmObject();
			codeName = OrderWaiverReasonCode.CutOffDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReason1Code
	 * OrderWaiverReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionWaiver"</li>
	 * </ul>
	 */
	public static final OrderWaiverReason1Code CommissionWaiver = new OrderWaiverReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionWaiver";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderWaiverReason1Code.mmObject();
			codeName = OrderWaiverReasonCode.CommissionWaiver.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderWaiverReason1Code> codesByName = new LinkedHashMap<>();

	protected OrderWaiverReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LATE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderWaiverReason1Code";
				definition = "Relates to non-standard orders, to handle them differently, probably in a manual fashion.";
				trace_lazy = () -> OrderWaiverReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderWaiverReason1Code.LateTradeDealing, com.tools20022.repository.codeset.OrderWaiverReason1Code.FrontEndLoadCharge,
						com.tools20022.repository.codeset.OrderWaiverReason1Code.BelowMinimumInvestmentAmount, com.tools20022.repository.codeset.OrderWaiverReason1Code.CutOffDate,
						com.tools20022.repository.codeset.OrderWaiverReason1Code.CommissionWaiver);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LateTradeDealing.getCodeName().get(), LateTradeDealing);
		codesByName.put(FrontEndLoadCharge.getCodeName().get(), FrontEndLoadCharge);
		codesByName.put(BelowMinimumInvestmentAmount.getCodeName().get(), BelowMinimumInvestmentAmount);
		codesByName.put(CutOffDate.getCodeName().get(), CutOffDate);
		codesByName.put(CommissionWaiver.getCodeName().get(), CommissionWaiver);
	}

	public static OrderWaiverReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderWaiverReason1Code[] values() {
		OrderWaiverReason1Code[] values = new OrderWaiverReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderWaiverReason1Code> {
		@Override
		public OrderWaiverReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderWaiverReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}