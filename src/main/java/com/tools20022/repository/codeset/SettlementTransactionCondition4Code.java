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
import com.tools20022.repository.codeset.SettlementTransactionCondition4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the conditions under which the order/trade is to be settled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code#Clean
 * SettlementTransactionCondition4Code.Clean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code#Dirty
 * SettlementTransactionCondition4Code.Dirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code#DeliveryWithoutMatching
 * SettlementTransactionCondition4Code.DeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code#Physical
 * SettlementTransactionCondition4Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code#SpecialDelivery
 * SettlementTransactionCondition4Code.SpecialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code#SplitSettlement
 * SettlementTransactionCondition4Code.SplitSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code#NoAutomaticMarketClaim
 * SettlementTransactionCondition4Code.NoAutomaticMarketClaim}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
 * SettlementTransactionConditionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CLEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTransactionCondition4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be settled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementTransactionCondition4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code
	 * SettlementTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition4Code Clean = new SettlementTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clean";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition4Code.mmObject();
			codeName = SettlementTransactionConditionCode.Clean.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code
	 * SettlementTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition4Code Dirty = new SettlementTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dirty";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition4Code.mmObject();
			codeName = SettlementTransactionConditionCode.Dirty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code
	 * SettlementTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryWithoutMatching"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition4Code DeliveryWithoutMatching = new SettlementTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryWithoutMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition4Code.mmObject();
			codeName = SettlementTransactionConditionCode.DeliveryWithoutMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code
	 * SettlementTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition4Code Physical = new SettlementTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition4Code.mmObject();
			codeName = SettlementTransactionConditionCode.Physical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code
	 * SettlementTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDelivery"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition4Code SpecialDelivery = new SettlementTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition4Code.mmObject();
			codeName = SettlementTransactionConditionCode.SpecialDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code
	 * SettlementTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitSettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition4Code SplitSettlement = new SettlementTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition4Code.mmObject();
			codeName = SettlementTransactionConditionCode.SplitSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition4Code
	 * SettlementTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaim"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition4Code NoAutomaticMarketClaim = new SettlementTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomaticMarketClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition4Code.mmObject();
			codeName = SettlementTransactionConditionCode.NoAutomaticMarketClaim.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementTransactionCondition4Code> codesByName = new LinkedHashMap<>();

	protected SettlementTransactionCondition4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CLEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionCondition4Code";
				definition = "Specifies the conditions under which the order/trade is to be settled.";
				trace_lazy = () -> SettlementTransactionConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionCondition4Code.Clean, com.tools20022.repository.codeset.SettlementTransactionCondition4Code.Dirty,
						com.tools20022.repository.codeset.SettlementTransactionCondition4Code.DeliveryWithoutMatching, com.tools20022.repository.codeset.SettlementTransactionCondition4Code.Physical,
						com.tools20022.repository.codeset.SettlementTransactionCondition4Code.SpecialDelivery, com.tools20022.repository.codeset.SettlementTransactionCondition4Code.SplitSettlement,
						com.tools20022.repository.codeset.SettlementTransactionCondition4Code.NoAutomaticMarketClaim);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Clean.getCodeName().get(), Clean);
		codesByName.put(Dirty.getCodeName().get(), Dirty);
		codesByName.put(DeliveryWithoutMatching.getCodeName().get(), DeliveryWithoutMatching);
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(SpecialDelivery.getCodeName().get(), SpecialDelivery);
		codesByName.put(SplitSettlement.getCodeName().get(), SplitSettlement);
		codesByName.put(NoAutomaticMarketClaim.getCodeName().get(), NoAutomaticMarketClaim);
	}

	public static SettlementTransactionCondition4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementTransactionCondition4Code[] values() {
		SettlementTransactionCondition4Code[] values = new SettlementTransactionCondition4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementTransactionCondition4Code> {
		@Override
		public SettlementTransactionCondition4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementTransactionCondition4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}