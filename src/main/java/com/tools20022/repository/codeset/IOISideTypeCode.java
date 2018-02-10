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
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.IOISideTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of the side of the indication.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.IOISideTypeCode#Buy
 * IOISideTypeCode.Buy}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IOISideTypeCode#Sell
 * IOISideTypeCode.Sell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IOISideTypeCode#Undisclosed
 * IOISideTypeCode.Undisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IOISideTypeCode#AsDefined
 * IOISideTypeCode.AsDefined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IOISideTypeCode#Opposite
 * IOISideTypeCode.Opposite}</li>
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
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: 54</li>
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
 * "IOISideTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the type of the side of the indication."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IOISideTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IOISideTypeCode
	 * IOISideTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buy"</li>
	 * </ul>
	 */
	public static final IOISideTypeCode Buy = new IOISideTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buy";
			owner_lazy = () -> com.tools20022.repository.codeset.IOISideTypeCode.mmObject();
			codeName = SideCode.Buy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IOISideTypeCode
	 * IOISideTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sell"</li>
	 * </ul>
	 */
	public static final IOISideTypeCode Sell = new IOISideTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sell";
			owner_lazy = () -> com.tools20022.repository.codeset.IOISideTypeCode.mmObject();
			codeName = SideCode.Sell.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IOISideTypeCode
	 * IOISideTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undisclosed"</li>
	 * </ul>
	 */
	public static final IOISideTypeCode Undisclosed = new IOISideTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undisclosed";
			owner_lazy = () -> com.tools20022.repository.codeset.IOISideTypeCode.mmObject();
			codeName = SideCode.Undisclosed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IOISideTypeCode
	 * IOISideTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsDefined"</li>
	 * </ul>
	 */
	public static final IOISideTypeCode AsDefined = new IOISideTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsDefined";
			owner_lazy = () -> com.tools20022.repository.codeset.IOISideTypeCode.mmObject();
			codeName = SideCode.AsDefined.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IOISideTypeCode
	 * IOISideTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opposite"</li>
	 * </ul>
	 */
	public static final IOISideTypeCode Opposite = new IOISideTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Opposite";
			owner_lazy = () -> com.tools20022.repository.codeset.IOISideTypeCode.mmObject();
			codeName = SideCode.Opposite.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, IOISideTypeCode> codesByName = new LinkedHashMap<>();

	protected IOISideTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
				example = Arrays.asList("BUYI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IOISideTypeCode";
				definition = "Indicates the type of the side of the indication.";
				trace_lazy = () -> SideCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IOISideTypeCode.Buy, com.tools20022.repository.codeset.IOISideTypeCode.Sell, com.tools20022.repository.codeset.IOISideTypeCode.Undisclosed,
						com.tools20022.repository.codeset.IOISideTypeCode.AsDefined, com.tools20022.repository.codeset.IOISideTypeCode.Opposite);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Buy.getCodeName().get(), Buy);
		codesByName.put(Sell.getCodeName().get(), Sell);
		codesByName.put(Undisclosed.getCodeName().get(), Undisclosed);
		codesByName.put(AsDefined.getCodeName().get(), AsDefined);
		codesByName.put(Opposite.getCodeName().get(), Opposite);
	}

	public static IOISideTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IOISideTypeCode[] values() {
		IOISideTypeCode[] values = new IOISideTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IOISideTypeCode> {
		@Override
		public IOISideTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IOISideTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}