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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Side5Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.Side5Code#SellShort
 * Side5Code.SellShort}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side5Code#Sell
 * Side5Code.Sell}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side5Code#SellShortExempt
 * Side5Code.SellShortExempt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Side5Code#Undisclosed
 * Side5Code.Undisclosed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
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
 * "Side5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Side taken by a party on an order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Side5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side5Code Side5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellShort"</li>
	 * </ul>
	 */
	public static final Side5Code SellShort = new Side5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShort";
			owner_lazy = () -> com.tools20022.repository.codeset.Side5Code.mmObject();
			codeName = SideCode.SellShort.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side5Code Side5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::BUSE//SELL, FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sell"</li>
	 * </ul>
	 */
	public static final Side5Code Sell = new Side5Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::BUSE//SELL"), new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sell";
			owner_lazy = () -> com.tools20022.repository.codeset.Side5Code.mmObject();
			codeName = SideCode.Sell.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side5Code Side5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellShortExempt"</li>
	 * </ul>
	 */
	public static final Side5Code SellShortExempt = new Side5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShortExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.Side5Code.mmObject();
			codeName = SideCode.SellShortExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Side5Code Side5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undisclosed"</li>
	 * </ul>
	 */
	public static final Side5Code Undisclosed = new Side5Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undisclosed";
			owner_lazy = () -> com.tools20022.repository.codeset.Side5Code.mmObject();
			codeName = SideCode.Undisclosed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Side5Code> codesByName = new LinkedHashMap<>();

	protected Side5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Side5Code";
				definition = "Side taken by a party on an order.";
				trace_lazy = () -> SideCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Side5Code.SellShort, com.tools20022.repository.codeset.Side5Code.Sell, com.tools20022.repository.codeset.Side5Code.SellShortExempt,
						com.tools20022.repository.codeset.Side5Code.Undisclosed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SellShort.getCodeName().get(), SellShort);
		codesByName.put(Sell.getCodeName().get(), Sell);
		codesByName.put(SellShortExempt.getCodeName().get(), SellShortExempt);
		codesByName.put(Undisclosed.getCodeName().get(), Undisclosed);
	}

	public static Side5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Side5Code[] values() {
		Side5Code[] values = new Side5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Side5Code> {
		@Override
		public Side5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Side5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}