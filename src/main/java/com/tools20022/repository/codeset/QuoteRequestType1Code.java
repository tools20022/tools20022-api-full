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
import com.tools20022.repository.codeset.QuoteRequestType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of quote request (e.g. manual vs. automatic) being
 * generated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteRequestType1Code#Manual
 * QuoteRequestType1Code.Manual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteRequestType1Code#Automatic
 * QuoteRequestType1Code.Automatic}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QuoteRequestTypeCode
 * QuoteRequestTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MANU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteRequestType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of quote request (e.g. manual vs. automatic) being generated."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QuoteRequestType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteRequestType1Code
	 * QuoteRequestType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manual"</li>
	 * </ul>
	 */
	public static final QuoteRequestType1Code Manual = new QuoteRequestType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manual";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteRequestType1Code.mmObject();
			codeName = QuoteRequestTypeCode.Manual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteRequestType1Code
	 * QuoteRequestType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Automatic"</li>
	 * </ul>
	 */
	public static final QuoteRequestType1Code Automatic = new QuoteRequestType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Automatic";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteRequestType1Code.mmObject();
			codeName = QuoteRequestTypeCode.Automatic.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, QuoteRequestType1Code> codesByName = new LinkedHashMap<>();

	protected QuoteRequestType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MANU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuoteRequestType1Code";
				definition = "Indicates the type of quote request (e.g. manual vs. automatic) being generated.";
				trace_lazy = () -> QuoteRequestTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuoteRequestType1Code.Manual, com.tools20022.repository.codeset.QuoteRequestType1Code.Automatic);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Manual.getCodeName().get(), Manual);
		codesByName.put(Automatic.getCodeName().get(), Automatic);
	}

	public static QuoteRequestType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QuoteRequestType1Code[] values() {
		QuoteRequestType1Code[] values = new QuoteRequestType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QuoteRequestType1Code> {
		@Override
		public QuoteRequestType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QuoteRequestType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}