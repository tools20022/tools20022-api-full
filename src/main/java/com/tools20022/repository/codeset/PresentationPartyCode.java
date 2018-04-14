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
import com.tools20022.repository.codeset.PresentationPartyCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PresentationPartyCode#ExclusiveConfirmer
 * PresentationPartyCode.ExclusiveConfirmer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PresentationPartyCode#ExclusiveIssuer
 * PresentationPartyCode.ExclusiveIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PresentationPartyCode#IssuerOrOtherNominatatedParty
 * PresentationPartyCode.IssuerOrOtherNominatatedParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PresentationParty1Code
 * PresentationParty1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PresentationPartyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the party to receive the presentation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EXCN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PresentationPartyCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Presentation made exclusively to the confirmer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationPartyCode
	 * PresentationPartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExclusiveConfirmer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation made exclusively to the confirmer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PresentationPartyCode ExclusiveConfirmer = new PresentationPartyCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExclusiveConfirmer";
			definition = "Presentation made exclusively to the confirmer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationPartyCode.mmObject();
			codeName = "EXCN";
		}
	};
	/**
	 * Presentation made exclusively to the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationPartyCode
	 * PresentationPartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXIS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExclusiveIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation made exclusively to the issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PresentationPartyCode ExclusiveIssuer = new PresentationPartyCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExclusiveIssuer";
			definition = "Presentation made exclusively to the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationPartyCode.mmObject();
			codeName = "EXIS";
		}
	};
	/**
	 * Presentation made either to the issuer or other nominated party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationPartyCode
	 * PresentationPartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOrOtherNominatatedParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Presentation made either to the issuer or other nominated party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PresentationPartyCode IssuerOrOtherNominatatedParty = new PresentationPartyCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOrOtherNominatatedParty";
			definition = "Presentation made either to the issuer or other nominated party.";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationPartyCode.mmObject();
			codeName = "ETHR";
		}
	};
	final static private LinkedHashMap<String, PresentationPartyCode> codesByName = new LinkedHashMap<>();

	protected PresentationPartyCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXCN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PresentationPartyCode";
				definition = "Specifies the party to receive the presentation.";
				derivation_lazy = () -> Arrays.asList(PresentationParty1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PresentationPartyCode.ExclusiveConfirmer, com.tools20022.repository.codeset.PresentationPartyCode.ExclusiveIssuer,
						com.tools20022.repository.codeset.PresentationPartyCode.IssuerOrOtherNominatatedParty);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ExclusiveConfirmer.getCodeName().get(), ExclusiveConfirmer);
		codesByName.put(ExclusiveIssuer.getCodeName().get(), ExclusiveIssuer);
		codesByName.put(IssuerOrOtherNominatatedParty.getCodeName().get(), IssuerOrOtherNominatatedParty);
	}

	public static PresentationPartyCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PresentationPartyCode[] values() {
		PresentationPartyCode[] values = new PresentationPartyCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PresentationPartyCode> {
		@Override
		public PresentationPartyCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PresentationPartyCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}