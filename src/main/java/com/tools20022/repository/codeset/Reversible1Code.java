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
import com.tools20022.repository.codeset.Reversible1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the possibility to terminate the securitiesc lending contract
 * either by the borrower or lender before the expiration date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Reversible1Code#Reversible
 * Reversible1Code.Reversible}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Reversible1Code#Fixed
 * Reversible1Code.Fixed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Reversible1Code#CallBack
 * Reversible1Code.CallBack}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReversibleCode ReversibleCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REVL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Reversible1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the possibility to terminate the securitiesc lending contract either by the borrower or lender before the expiration date."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Reversible1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reversible1Code
	 * Reversible1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversible"</li>
	 * </ul>
	 */
	public static final Reversible1Code Reversible = new Reversible1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversible";
			owner_lazy = () -> com.tools20022.repository.codeset.Reversible1Code.mmObject();
			codeName = ReversibleCode.Reversible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reversible1Code
	 * Reversible1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * </ul>
	 */
	public static final Reversible1Code Fixed = new Reversible1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			owner_lazy = () -> com.tools20022.repository.codeset.Reversible1Code.mmObject();
			codeName = ReversibleCode.Fixed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reversible1Code
	 * Reversible1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallBack"</li>
	 * </ul>
	 */
	public static final Reversible1Code CallBack = new Reversible1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallBack";
			owner_lazy = () -> com.tools20022.repository.codeset.Reversible1Code.mmObject();
			codeName = ReversibleCode.CallBack.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Reversible1Code> codesByName = new LinkedHashMap<>();

	protected Reversible1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REVL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reversible1Code";
				definition = "Indicates the possibility to terminate the securitiesc lending contract either by the borrower or lender before the expiration date.";
				trace_lazy = () -> ReversibleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Reversible1Code.Reversible, com.tools20022.repository.codeset.Reversible1Code.Fixed, com.tools20022.repository.codeset.Reversible1Code.CallBack);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Reversible.getCodeName().get(), Reversible);
		codesByName.put(Fixed.getCodeName().get(), Fixed);
		codesByName.put(CallBack.getCodeName().get(), CallBack);
	}

	public static Reversible1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Reversible1Code[] values() {
		Reversible1Code[] values = new Reversible1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Reversible1Code> {
		@Override
		public Reversible1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Reversible1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}