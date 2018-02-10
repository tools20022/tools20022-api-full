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
import com.tools20022.repository.codeset.Side3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Side taken by a party on an order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#Buy
 * Side3Code.Buy}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#Sell
 * Side3Code.Sell}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#Cross
 * Side3Code.Cross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#CrossShort
 * Side3Code.CrossShort}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#CrossShortExempt
 * Side3Code.CrossShortExempt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#AsDefined
 * Side3Code.AsDefined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#Opposite
 * Side3Code.Opposite}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#Undisclosed
 * Side3Code.Undisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#TwoSided
 * Side3Code.TwoSided}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#BuyMinus
 * Side3Code.BuyMinus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#SellPlus
 * Side3Code.SellPlus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#SellShort
 * Side3Code.SellShort}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#SellShortExempt
 * Side3Code.SellShortExempt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#Lend
 * Side3Code.Lend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#Borrow
 * Side3Code.Borrow}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side3Code#OptionExercise
 * Side3Code.OptionExercise}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BUYI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Side3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Side taken by a party on an order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Side3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buy"</li>
	 * </ul>
	 */
	public static final Side3Code Buy = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buy";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.Buy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sell"</li>
	 * </ul>
	 */
	public static final Side3Code Sell = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sell";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.Sell.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cross"</li>
	 * </ul>
	 */
	public static final Side3Code Cross = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cross";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.Cross.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossShort"</li>
	 * </ul>
	 */
	public static final Side3Code CrossShort = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossShort";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.CrossShort.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossShortExempt"</li>
	 * </ul>
	 */
	public static final Side3Code CrossShortExempt = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossShortExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.CrossShortExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsDefined"</li>
	 * </ul>
	 */
	public static final Side3Code AsDefined = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsDefined";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.AsDefined.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opposite"</li>
	 * </ul>
	 */
	public static final Side3Code Opposite = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Opposite";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.Opposite.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undisclosed"</li>
	 * </ul>
	 */
	public static final Side3Code Undisclosed = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undisclosed";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.Undisclosed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoSided"</li>
	 * </ul>
	 */
	public static final Side3Code TwoSided = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoSided";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.TwoSided.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyMinus"</li>
	 * </ul>
	 */
	public static final Side3Code BuyMinus = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyMinus";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.BuyMinus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellPlus"</li>
	 * </ul>
	 */
	public static final Side3Code SellPlus = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellPlus";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.SellPlus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellShort"</li>
	 * </ul>
	 */
	public static final Side3Code SellShort = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShort";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.SellShort.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellShortExempt"</li>
	 * </ul>
	 */
	public static final Side3Code SellShortExempt = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShortExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.SellShortExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lend"</li>
	 * </ul>
	 */
	public static final Side3Code Lend = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lend";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.Lend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrow"</li>
	 * </ul>
	 */
	public static final Side3Code Borrow = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrow";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.Borrow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side3Code Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionExercise"</li>
	 * </ul>
	 */
	public static final Side3Code OptionExercise = new Side3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionExercise";
			owner_lazy = () -> com.tools20022.repository.codeset.Side3Code.mmObject();
			codeName = SideCode.OptionExercise.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Side3Code> codesByName = new LinkedHashMap<>();

	protected Side3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BUYI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Side3Code";
				definition = "Side taken by a party on an order.";
				trace_lazy = () -> SideCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Side3Code.Buy, com.tools20022.repository.codeset.Side3Code.Sell, com.tools20022.repository.codeset.Side3Code.Cross,
						com.tools20022.repository.codeset.Side3Code.CrossShort, com.tools20022.repository.codeset.Side3Code.CrossShortExempt, com.tools20022.repository.codeset.Side3Code.AsDefined,
						com.tools20022.repository.codeset.Side3Code.Opposite, com.tools20022.repository.codeset.Side3Code.Undisclosed, com.tools20022.repository.codeset.Side3Code.TwoSided,
						com.tools20022.repository.codeset.Side3Code.BuyMinus, com.tools20022.repository.codeset.Side3Code.SellPlus, com.tools20022.repository.codeset.Side3Code.SellShort,
						com.tools20022.repository.codeset.Side3Code.SellShortExempt, com.tools20022.repository.codeset.Side3Code.Lend, com.tools20022.repository.codeset.Side3Code.Borrow,
						com.tools20022.repository.codeset.Side3Code.OptionExercise);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Buy.getCodeName().get(), Buy);
		codesByName.put(Sell.getCodeName().get(), Sell);
		codesByName.put(Cross.getCodeName().get(), Cross);
		codesByName.put(CrossShort.getCodeName().get(), CrossShort);
		codesByName.put(CrossShortExempt.getCodeName().get(), CrossShortExempt);
		codesByName.put(AsDefined.getCodeName().get(), AsDefined);
		codesByName.put(Opposite.getCodeName().get(), Opposite);
		codesByName.put(Undisclosed.getCodeName().get(), Undisclosed);
		codesByName.put(TwoSided.getCodeName().get(), TwoSided);
		codesByName.put(BuyMinus.getCodeName().get(), BuyMinus);
		codesByName.put(SellPlus.getCodeName().get(), SellPlus);
		codesByName.put(SellShort.getCodeName().get(), SellShort);
		codesByName.put(SellShortExempt.getCodeName().get(), SellShortExempt);
		codesByName.put(Lend.getCodeName().get(), Lend);
		codesByName.put(Borrow.getCodeName().get(), Borrow);
		codesByName.put(OptionExercise.getCodeName().get(), OptionExercise);
	}

	public static Side3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Side3Code[] values() {
		Side3Code[] values = new Side3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Side3Code> {
		@Override
		public Side3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Side3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}