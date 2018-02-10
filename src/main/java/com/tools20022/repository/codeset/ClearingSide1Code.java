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
import com.tools20022.repository.codeset.ClearingSide1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.ClearingSide1Code#Buy
 * ClearingSide1Code.Buy}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ClearingSide1Code#Sell
 * ClearingSide1Code.Sell}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ClearingSide1Code#Lend
 * ClearingSide1Code.Lend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ClearingSide1Code#Borrow
 * ClearingSide1Code.Borrow}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ClearingSideCode
 * ClearingSideCode}</li>
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
 * "ClearingSide1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Side taken by a party on an order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClearingSide1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingSide1Code
	 * ClearingSide1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buy"</li>
	 * </ul>
	 */
	public static final ClearingSide1Code Buy = new ClearingSide1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buy";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingSide1Code.mmObject();
			codeName = ClearingSideCode.Buy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingSide1Code
	 * ClearingSide1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sell"</li>
	 * </ul>
	 */
	public static final ClearingSide1Code Sell = new ClearingSide1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sell";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingSide1Code.mmObject();
			codeName = ClearingSideCode.Sell.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingSide1Code
	 * ClearingSide1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lend"</li>
	 * </ul>
	 */
	public static final ClearingSide1Code Lend = new ClearingSide1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lend";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingSide1Code.mmObject();
			codeName = ClearingSideCode.Lend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingSide1Code
	 * ClearingSide1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrow"</li>
	 * </ul>
	 */
	public static final ClearingSide1Code Borrow = new ClearingSide1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrow";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingSide1Code.mmObject();
			codeName = ClearingSideCode.Borrow.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ClearingSide1Code> codesByName = new LinkedHashMap<>();

	protected ClearingSide1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BUYI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingSide1Code";
				definition = "Side taken by a party on an order.";
				trace_lazy = () -> ClearingSideCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingSide1Code.Buy, com.tools20022.repository.codeset.ClearingSide1Code.Sell, com.tools20022.repository.codeset.ClearingSide1Code.Lend,
						com.tools20022.repository.codeset.ClearingSide1Code.Borrow);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Buy.getCodeName().get(), Buy);
		codesByName.put(Sell.getCodeName().get(), Sell);
		codesByName.put(Lend.getCodeName().get(), Lend);
		codesByName.put(Borrow.getCodeName().get(), Borrow);
	}

	public static ClearingSide1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClearingSide1Code[] values() {
		ClearingSide1Code[] values = new ClearingSide1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClearingSide1Code> {
		@Override
		public ClearingSide1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClearingSide1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}