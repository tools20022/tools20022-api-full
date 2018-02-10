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
import com.tools20022.repository.codeset.SettlementTransactionCondition3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#Assignement
 * SettlementTransactionCondition3Code.Assignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#Clean
 * SettlementTransactionCondition3Code.Clean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#Dirty
 * SettlementTransactionCondition3Code.Dirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#DeliveryWithoutMatching
 * SettlementTransactionCondition3Code.DeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#Drawn
 * SettlementTransactionCondition3Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#Exercised
 * SettlementTransactionCondition3Code.Exercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#FreeCleanSettlement
 * SettlementTransactionCondition3Code.FreeCleanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#KnockedOut
 * SettlementTransactionCondition3Code.KnockedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#Physical
 * SettlementTransactionCondition3Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#Residual
 * SettlementTransactionCondition3Code.Residual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#SpecialDelivery
 * SettlementTransactionCondition3Code.SpecialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#SplitSettlement
 * SettlementTransactionCondition3Code.SplitSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code#Unexposed
 * SettlementTransactionCondition3Code.Unexposed}</li>
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
 * <li>"ASGN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTransactionCondition3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be settled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementTransactionCondition3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code Assignement = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.Assignement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code Clean = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clean";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.Clean.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code Dirty = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dirty";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.Dirty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryWithoutMatching"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code DeliveryWithoutMatching = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryWithoutMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.DeliveryWithoutMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code Drawn = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.Drawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercised"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code Exercised = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercised";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.Exercised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeCleanSettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code FreeCleanSettlement = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeCleanSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.FreeCleanSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnockedOut"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code KnockedOut = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnockedOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.KnockedOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code Physical = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.Physical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residual"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code Residual = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Residual";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.Residual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDelivery"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code SpecialDelivery = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.SpecialDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitSettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code SplitSettlement = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.SplitSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition3Code
	 * SettlementTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unexposed"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition3Code Unexposed = new SettlementTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unexposed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition3Code.mmObject();
			codeName = SettlementTransactionConditionCode.Unexposed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementTransactionCondition3Code> codesByName = new LinkedHashMap<>();

	protected SettlementTransactionCondition3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ASGN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionCondition3Code";
				definition = "Specifies the conditions under which the order/trade is to be settled.";
				trace_lazy = () -> SettlementTransactionConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionCondition3Code.Assignement, com.tools20022.repository.codeset.SettlementTransactionCondition3Code.Clean,
						com.tools20022.repository.codeset.SettlementTransactionCondition3Code.Dirty, com.tools20022.repository.codeset.SettlementTransactionCondition3Code.DeliveryWithoutMatching,
						com.tools20022.repository.codeset.SettlementTransactionCondition3Code.Drawn, com.tools20022.repository.codeset.SettlementTransactionCondition3Code.Exercised,
						com.tools20022.repository.codeset.SettlementTransactionCondition3Code.FreeCleanSettlement, com.tools20022.repository.codeset.SettlementTransactionCondition3Code.KnockedOut,
						com.tools20022.repository.codeset.SettlementTransactionCondition3Code.Physical, com.tools20022.repository.codeset.SettlementTransactionCondition3Code.Residual,
						com.tools20022.repository.codeset.SettlementTransactionCondition3Code.SpecialDelivery, com.tools20022.repository.codeset.SettlementTransactionCondition3Code.SplitSettlement,
						com.tools20022.repository.codeset.SettlementTransactionCondition3Code.Unexposed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Assignement.getCodeName().get(), Assignement);
		codesByName.put(Clean.getCodeName().get(), Clean);
		codesByName.put(Dirty.getCodeName().get(), Dirty);
		codesByName.put(DeliveryWithoutMatching.getCodeName().get(), DeliveryWithoutMatching);
		codesByName.put(Drawn.getCodeName().get(), Drawn);
		codesByName.put(Exercised.getCodeName().get(), Exercised);
		codesByName.put(FreeCleanSettlement.getCodeName().get(), FreeCleanSettlement);
		codesByName.put(KnockedOut.getCodeName().get(), KnockedOut);
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(Residual.getCodeName().get(), Residual);
		codesByName.put(SpecialDelivery.getCodeName().get(), SpecialDelivery);
		codesByName.put(SplitSettlement.getCodeName().get(), SplitSettlement);
		codesByName.put(Unexposed.getCodeName().get(), Unexposed);
	}

	public static SettlementTransactionCondition3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementTransactionCondition3Code[] values() {
		SettlementTransactionCondition3Code[] values = new SettlementTransactionCondition3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementTransactionCondition3Code> {
		@Override
		public SettlementTransactionCondition3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementTransactionCondition3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}