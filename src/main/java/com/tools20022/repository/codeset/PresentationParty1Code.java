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
import com.tools20022.repository.codeset.PresentationParty1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the party to receive the presentation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PresentationParty1Code#IssuerOrOtherNominatatedParty
 * PresentationParty1Code.IssuerOrOtherNominatatedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PresentationParty1Code#ExclusiveConfirmer
 * PresentationParty1Code.ExclusiveConfirmer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PresentationParty1Code#ExclusiveIssuer
 * PresentationParty1Code.ExclusiveIssuer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PresentationPartyCode
 * PresentationPartyCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PresentationParty1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the party to receive the presentation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ETHR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PresentationParty1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationParty1Code
	 * PresentationParty1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOrOtherNominatatedParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PresentationParty1Code IssuerOrOtherNominatatedParty = new PresentationParty1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOrOtherNominatatedParty";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationParty1Code.mmObject();
			codeName = PresentationPartyCode.IssuerOrOtherNominatatedParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationParty1Code
	 * PresentationParty1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExclusiveConfirmer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PresentationParty1Code ExclusiveConfirmer = new PresentationParty1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExclusiveConfirmer";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationParty1Code.mmObject();
			codeName = PresentationPartyCode.ExclusiveConfirmer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationParty1Code
	 * PresentationParty1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExclusiveIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PresentationParty1Code ExclusiveIssuer = new PresentationParty1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExclusiveIssuer";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationParty1Code.mmObject();
			codeName = PresentationPartyCode.ExclusiveIssuer.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PresentationParty1Code> codesByName = new LinkedHashMap<>();

	protected PresentationParty1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ETHR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PresentationParty1Code";
				definition = "Specifies the party to receive the presentation.";
				trace_lazy = () -> PresentationPartyCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PresentationParty1Code.IssuerOrOtherNominatatedParty, com.tools20022.repository.codeset.PresentationParty1Code.ExclusiveConfirmer,
						com.tools20022.repository.codeset.PresentationParty1Code.ExclusiveIssuer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IssuerOrOtherNominatatedParty.getCodeName().get(), IssuerOrOtherNominatatedParty);
		codesByName.put(ExclusiveConfirmer.getCodeName().get(), ExclusiveConfirmer);
		codesByName.put(ExclusiveIssuer.getCodeName().get(), ExclusiveIssuer);
	}

	public static PresentationParty1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PresentationParty1Code[] values() {
		PresentationParty1Code[] values = new PresentationParty1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PresentationParty1Code> {
		@Override
		public PresentationParty1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PresentationParty1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}