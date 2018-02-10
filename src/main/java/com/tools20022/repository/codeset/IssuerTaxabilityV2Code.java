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
import com.tools20022.repository.codeset.IssuerTaxabilityV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the corporate action proceeds are taxable at issuer level.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerTaxabilityV2Code#Taxable
 * IssuerTaxabilityV2Code.Taxable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerTaxability2Code
 * IssuerTaxability2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TXBL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IssuerTaxabilityV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the corporate action proceeds are taxable at issuer level."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IssuerTaxabilityV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The relevant proceeds are taxable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerTaxabilityV2Code
	 * IssuerTaxabilityV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Taxable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The relevant proceeds are taxable."</li>
	 * </ul>
	 */
	public static final IssuerTaxabilityV2Code Taxable = new IssuerTaxabilityV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Taxable";
			definition = "The relevant proceeds are taxable.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerTaxabilityV2Code.mmObject();
			codeName = "TXBL";
		}
	};
	final static private LinkedHashMap<String, IssuerTaxabilityV2Code> codesByName = new LinkedHashMap<>();

	protected IssuerTaxabilityV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TXBL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IssuerTaxabilityV2Code";
				definition = "Specifies whether the corporate action proceeds are taxable at issuer level.";
				derivation_lazy = () -> Arrays.asList(IssuerTaxability2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IssuerTaxabilityV2Code.Taxable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Taxable.getCodeName().get(), Taxable);
	}

	public static IssuerTaxabilityV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IssuerTaxabilityV2Code[] values() {
		IssuerTaxabilityV2Code[] values = new IssuerTaxabilityV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IssuerTaxabilityV2Code> {
		@Override
		public IssuerTaxabilityV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IssuerTaxabilityV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}