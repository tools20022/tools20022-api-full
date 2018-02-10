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
import com.tools20022.repository.codeset.SettlementTransactionCondition7Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#Assignment
 * SettlementTransactionCondition7Code.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#Clean
 * SettlementTransactionCondition7Code.Clean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#Dirty
 * SettlementTransactionCondition7Code.Dirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#DeliveryWithoutMatching
 * SettlementTransactionCondition7Code.DeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#Drawn
 * SettlementTransactionCondition7Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#Exercised
 * SettlementTransactionCondition7Code.Exercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#FreeCleanSettlement
 * SettlementTransactionCondition7Code.FreeCleanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#KnockedOut
 * SettlementTransactionCondition7Code.KnockedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#Physical
 * SettlementTransactionCondition7Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#CSDPaymentOnly
 * SettlementTransactionCondition7Code.CSDPaymentOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#SplitCurrencySettlement
 * SettlementTransactionCondition7Code.SplitCurrencySettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#SpecialDelivery
 * SettlementTransactionCondition7Code.SpecialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#SplitSettlement
 * SettlementTransactionCondition7Code.SplitSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code#Unexposed
 * SettlementTransactionCondition7Code.Unexposed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
 * SettlementTransactionConditionV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ASGN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTransactionCondition7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be settled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementTransactionCondition7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code Assignment = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.Assignment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code Clean = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clean";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.Clean.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code Dirty = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dirty";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.Dirty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryWithoutMatching"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code DeliveryWithoutMatching = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryWithoutMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.DeliveryWithoutMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code Drawn = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.Drawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercised"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code Exercised = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercised";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.Exercised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeCleanSettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code FreeCleanSettlement = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeCleanSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.FreeCleanSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnockedOut"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code KnockedOut = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnockedOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.KnockedOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code Physical = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.Physical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDPaymentOnly"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code CSDPaymentOnly = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDPaymentOnly";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.CSDPaymentOnly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitCurrencySettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code SplitCurrencySettlement = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitCurrencySettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.SplitCurrencySettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDelivery"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code SpecialDelivery = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.SpecialDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitSettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code SplitSettlement = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.SplitSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
	 * SettlementTransactionCondition7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unexposed"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition7Code Unexposed = new SettlementTransactionCondition7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unexposed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition7Code.mmObject();
			codeName = SettlementTransactionConditionV2Code.Unexposed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementTransactionCondition7Code> codesByName = new LinkedHashMap<>();

	protected SettlementTransactionCondition7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ASGN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionCondition7Code";
				definition = "Specifies the conditions under which the order/trade is to be settled.";
				trace_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionCondition7Code.Assignment, com.tools20022.repository.codeset.SettlementTransactionCondition7Code.Clean,
						com.tools20022.repository.codeset.SettlementTransactionCondition7Code.Dirty, com.tools20022.repository.codeset.SettlementTransactionCondition7Code.DeliveryWithoutMatching,
						com.tools20022.repository.codeset.SettlementTransactionCondition7Code.Drawn, com.tools20022.repository.codeset.SettlementTransactionCondition7Code.Exercised,
						com.tools20022.repository.codeset.SettlementTransactionCondition7Code.FreeCleanSettlement, com.tools20022.repository.codeset.SettlementTransactionCondition7Code.KnockedOut,
						com.tools20022.repository.codeset.SettlementTransactionCondition7Code.Physical, com.tools20022.repository.codeset.SettlementTransactionCondition7Code.CSDPaymentOnly,
						com.tools20022.repository.codeset.SettlementTransactionCondition7Code.SplitCurrencySettlement, com.tools20022.repository.codeset.SettlementTransactionCondition7Code.SpecialDelivery,
						com.tools20022.repository.codeset.SettlementTransactionCondition7Code.SplitSettlement, com.tools20022.repository.codeset.SettlementTransactionCondition7Code.Unexposed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Assignment.getCodeName().get(), Assignment);
		codesByName.put(Clean.getCodeName().get(), Clean);
		codesByName.put(Dirty.getCodeName().get(), Dirty);
		codesByName.put(DeliveryWithoutMatching.getCodeName().get(), DeliveryWithoutMatching);
		codesByName.put(Drawn.getCodeName().get(), Drawn);
		codesByName.put(Exercised.getCodeName().get(), Exercised);
		codesByName.put(FreeCleanSettlement.getCodeName().get(), FreeCleanSettlement);
		codesByName.put(KnockedOut.getCodeName().get(), KnockedOut);
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(CSDPaymentOnly.getCodeName().get(), CSDPaymentOnly);
		codesByName.put(SplitCurrencySettlement.getCodeName().get(), SplitCurrencySettlement);
		codesByName.put(SpecialDelivery.getCodeName().get(), SpecialDelivery);
		codesByName.put(SplitSettlement.getCodeName().get(), SplitSettlement);
		codesByName.put(Unexposed.getCodeName().get(), Unexposed);
	}

	public static SettlementTransactionCondition7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementTransactionCondition7Code[] values() {
		SettlementTransactionCondition7Code[] values = new SettlementTransactionCondition7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementTransactionCondition7Code> {
		@Override
		public SettlementTransactionCondition7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementTransactionCondition7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}