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
import com.tools20022.repository.codeset.Side1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the side of the quote request, from the buy-side perspective.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#Buy
 * Side1Code.Buy}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#Sell
 * Side1Code.Sell}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#TwoSided
 * Side1Code.TwoSided}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#BuyMinus
 * Side1Code.BuyMinus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#SellPlus
 * Side1Code.SellPlus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#SellShort
 * Side1Code.SellShort}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#SellShortExempt
 * Side1Code.SellShortExempt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#Cross
 * Side1Code.Cross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#CrossShort
 * Side1Code.CrossShort}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#CrossShortExempt
 * Side1Code.CrossShortExempt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#AsDefined
 * Side1Code.AsDefined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#Opposite
 * Side1Code.Opposite}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side1Code#Undisclosed
 * Side1Code.Undisclosed}</li>
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
 * "Side1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the side of the quote request, from the buy-side perspective."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Side1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buy"</li>
	 * </ul>
	 */
	public static final Side1Code Buy = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buy";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.Buy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sell"</li>
	 * </ul>
	 */
	public static final Side1Code Sell = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sell";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.Sell.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoSided"</li>
	 * </ul>
	 */
	public static final Side1Code TwoSided = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoSided";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.TwoSided.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyMinus"</li>
	 * </ul>
	 */
	public static final Side1Code BuyMinus = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyMinus";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.BuyMinus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellPlus"</li>
	 * </ul>
	 */
	public static final Side1Code SellPlus = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellPlus";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.SellPlus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellShort"</li>
	 * </ul>
	 */
	public static final Side1Code SellShort = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShort";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.SellShort.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellShortExempt"</li>
	 * </ul>
	 */
	public static final Side1Code SellShortExempt = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShortExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.SellShortExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cross"</li>
	 * </ul>
	 */
	public static final Side1Code Cross = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cross";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.Cross.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossShort"</li>
	 * </ul>
	 */
	public static final Side1Code CrossShort = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossShort";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.CrossShort.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossShortExempt"</li>
	 * </ul>
	 */
	public static final Side1Code CrossShortExempt = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossShortExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.CrossShortExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsDefined"</li>
	 * </ul>
	 */
	public static final Side1Code AsDefined = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsDefined";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.AsDefined.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opposite"</li>
	 * </ul>
	 */
	public static final Side1Code Opposite = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Opposite";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.Opposite.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side1Code Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undisclosed"</li>
	 * </ul>
	 */
	public static final Side1Code Undisclosed = new Side1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undisclosed";
			owner_lazy = () -> com.tools20022.repository.codeset.Side1Code.mmObject();
			codeName = SideCode.Undisclosed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Side1Code> codesByName = new LinkedHashMap<>();

	protected Side1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BUYI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Side1Code";
				definition = "Indicates the side of the quote request, from the buy-side perspective.";
				trace_lazy = () -> SideCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Side1Code.Buy, com.tools20022.repository.codeset.Side1Code.Sell, com.tools20022.repository.codeset.Side1Code.TwoSided,
						com.tools20022.repository.codeset.Side1Code.BuyMinus, com.tools20022.repository.codeset.Side1Code.SellPlus, com.tools20022.repository.codeset.Side1Code.SellShort,
						com.tools20022.repository.codeset.Side1Code.SellShortExempt, com.tools20022.repository.codeset.Side1Code.Cross, com.tools20022.repository.codeset.Side1Code.CrossShort,
						com.tools20022.repository.codeset.Side1Code.CrossShortExempt, com.tools20022.repository.codeset.Side1Code.AsDefined, com.tools20022.repository.codeset.Side1Code.Opposite,
						com.tools20022.repository.codeset.Side1Code.Undisclosed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Buy.getCodeName().get(), Buy);
		codesByName.put(Sell.getCodeName().get(), Sell);
		codesByName.put(TwoSided.getCodeName().get(), TwoSided);
		codesByName.put(BuyMinus.getCodeName().get(), BuyMinus);
		codesByName.put(SellPlus.getCodeName().get(), SellPlus);
		codesByName.put(SellShort.getCodeName().get(), SellShort);
		codesByName.put(SellShortExempt.getCodeName().get(), SellShortExempt);
		codesByName.put(Cross.getCodeName().get(), Cross);
		codesByName.put(CrossShort.getCodeName().get(), CrossShort);
		codesByName.put(CrossShortExempt.getCodeName().get(), CrossShortExempt);
		codesByName.put(AsDefined.getCodeName().get(), AsDefined);
		codesByName.put(Opposite.getCodeName().get(), Opposite);
		codesByName.put(Undisclosed.getCodeName().get(), Undisclosed);
	}

	public static Side1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Side1Code[] values() {
		Side1Code[] values = new Side1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Side1Code> {
		@Override
		public Side1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Side1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}