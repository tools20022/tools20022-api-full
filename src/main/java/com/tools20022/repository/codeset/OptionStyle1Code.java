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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OptionStyle1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines how an option can be exercised.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionStyle1Code#American
 * OptionStyle1Code.American}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionStyle1Code#European
 * OptionStyle1Code.European}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionStyle1Code#Bermudan
 * OptionStyle1Code.Bermudan}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionStyle1Code#Asian
 * OptionStyle1Code.Asian}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionStyle1Code#Canary
 * OptionStyle1Code.Canary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OptionStyleCode
 * OptionStyleCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :12a::OPST</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AMER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionStyle1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how an option can be exercised."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionStyle1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyle1Code
	 * OptionStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "American"</li>
	 * </ul>
	 */
	public static final OptionStyle1Code American = new OptionStyle1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "American";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionStyle1Code.mmObject();
			codeName = OptionStyleCode.American.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyle1Code
	 * OptionStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "European"</li>
	 * </ul>
	 */
	public static final OptionStyle1Code European = new OptionStyle1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "European";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionStyle1Code.mmObject();
			codeName = OptionStyleCode.European.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyle1Code
	 * OptionStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bermudan"</li>
	 * </ul>
	 */
	public static final OptionStyle1Code Bermudan = new OptionStyle1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bermudan";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionStyle1Code.mmObject();
			codeName = OptionStyleCode.Bermudan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyle1Code
	 * OptionStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asian"</li>
	 * </ul>
	 */
	public static final OptionStyle1Code Asian = new OptionStyle1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Asian";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionStyle1Code.mmObject();
			codeName = OptionStyleCode.Asian.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyle1Code
	 * OptionStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Canary"</li>
	 * </ul>
	 */
	public static final OptionStyle1Code Canary = new OptionStyle1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Canary";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionStyle1Code.mmObject();
			codeName = OptionStyleCode.Canary.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OptionStyle1Code> codesByName = new LinkedHashMap<>();

	protected OptionStyle1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":12a::OPST"));
				example = Arrays.asList("AMER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionStyle1Code";
				definition = "Defines how an option can be exercised.";
				trace_lazy = () -> OptionStyleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionStyle1Code.American, com.tools20022.repository.codeset.OptionStyle1Code.European, com.tools20022.repository.codeset.OptionStyle1Code.Bermudan,
						com.tools20022.repository.codeset.OptionStyle1Code.Asian, com.tools20022.repository.codeset.OptionStyle1Code.Canary);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(American.getCodeName().get(), American);
		codesByName.put(European.getCodeName().get(), European);
		codesByName.put(Bermudan.getCodeName().get(), Bermudan);
		codesByName.put(Asian.getCodeName().get(), Asian);
		codesByName.put(Canary.getCodeName().get(), Canary);
	}

	public static OptionStyle1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionStyle1Code[] values() {
		OptionStyle1Code[] values = new OptionStyle1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionStyle1Code> {
		@Override
		public OptionStyle1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionStyle1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}