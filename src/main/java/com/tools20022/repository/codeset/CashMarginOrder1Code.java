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
import com.tools20022.repository.codeset.CashMarginOrder1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies whether an order is a non-margin, an opening margin or a closing
 * margin order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CashMarginOrder1Code#Cash
 * CashMarginOrder1Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashMarginOrder1Code#MarginOpen
 * CashMarginOrder1Code.MarginOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashMarginOrder1Code#MarginClose
 * CashMarginOrder1Code.MarginClose}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CashMarginOrderCode
 * CashMarginOrderCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashMarginOrder1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies whether an order is a non-margin, an opening margin or a closing margin order."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashMarginOrder1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashMarginOrder1Code
	 * CashMarginOrder1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * </ul>
	 */
	public static final CashMarginOrder1Code Cash = new CashMarginOrder1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			owner_lazy = () -> com.tools20022.repository.codeset.CashMarginOrder1Code.mmObject();
			codeName = CashMarginOrderCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashMarginOrder1Code
	 * CashMarginOrder1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginOpen"</li>
	 * </ul>
	 */
	public static final CashMarginOrder1Code MarginOpen = new CashMarginOrder1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginOpen";
			owner_lazy = () -> com.tools20022.repository.codeset.CashMarginOrder1Code.mmObject();
			codeName = CashMarginOrderCode.MarginOpen.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashMarginOrder1Code
	 * CashMarginOrder1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginClose"</li>
	 * </ul>
	 */
	public static final CashMarginOrder1Code MarginClose = new CashMarginOrder1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginClose";
			owner_lazy = () -> com.tools20022.repository.codeset.CashMarginOrder1Code.mmObject();
			codeName = CashMarginOrderCode.MarginClose.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CashMarginOrder1Code> codesByName = new LinkedHashMap<>();

	protected CashMarginOrder1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashMarginOrder1Code";
				definition = "Identifies whether an order is a non-margin, an opening margin or a closing margin order.";
				trace_lazy = () -> CashMarginOrderCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashMarginOrder1Code.Cash, com.tools20022.repository.codeset.CashMarginOrder1Code.MarginOpen,
						com.tools20022.repository.codeset.CashMarginOrder1Code.MarginClose);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(MarginOpen.getCodeName().get(), MarginOpen);
		codesByName.put(MarginClose.getCodeName().get(), MarginClose);
	}

	public static CashMarginOrder1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashMarginOrder1Code[] values() {
		CashMarginOrder1Code[] values = new CashMarginOrder1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashMarginOrder1Code> {
		@Override
		public CashMarginOrder1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashMarginOrder1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}