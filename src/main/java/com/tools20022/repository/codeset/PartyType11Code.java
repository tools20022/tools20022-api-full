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
import com.tools20022.repository.codeset.PartyType11Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of entity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType11Code#Acceptor
 * PartyType11Code.Acceptor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType11Code#Acquirer
 * PartyType11Code.Acquirer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType11Code#CardIssuer
 * PartyType11Code.CardIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType11Code#DelegateIssuer
 * PartyType11Code.DelegateIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType11Code#IntermediaryAgent
 * PartyType11Code.IntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType11Code#OriginatingTerminal
 * PartyType11Code.OriginatingTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType11Code#CardApplication
 * PartyType11Code.CardApplication}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode PartyTypeCode}</li>
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
 * "PartyType11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of entity."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyType11Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType11Code
	 * PartyType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acceptor"</li>
	 * </ul>
	 */
	public static final PartyType11Code Acceptor = new PartyType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acceptor";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType11Code.mmObject();
			codeName = PartyTypeCode.Acceptor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType11Code
	 * PartyType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * </ul>
	 */
	public static final PartyType11Code Acquirer = new PartyType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType11Code.mmObject();
			codeName = PartyTypeCode.Acquirer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType11Code
	 * PartyType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuer"</li>
	 * </ul>
	 */
	public static final PartyType11Code CardIssuer = new PartyType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuer";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType11Code.mmObject();
			codeName = PartyTypeCode.CardIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType11Code
	 * PartyType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegateIssuer"</li>
	 * </ul>
	 */
	public static final PartyType11Code DelegateIssuer = new PartyType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegateIssuer";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType11Code.mmObject();
			codeName = PartyTypeCode.DelegateIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType11Code
	 * PartyType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * </ul>
	 */
	public static final PartyType11Code IntermediaryAgent = new PartyType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType11Code.mmObject();
			codeName = PartyTypeCode.IntermediaryAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType11Code
	 * PartyType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingTerminal"</li>
	 * </ul>
	 */
	public static final PartyType11Code OriginatingTerminal = new PartyType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingTerminal";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType11Code.mmObject();
			codeName = PartyTypeCode.OriginatingTerminal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType11Code
	 * PartyType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardApplication"</li>
	 * </ul>
	 */
	public static final PartyType11Code CardApplication = new PartyType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardApplication";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType11Code.mmObject();
			codeName = PartyTypeCode.CardApplication.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PartyType11Code> codesByName = new LinkedHashMap<>();

	protected PartyType11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyType11Code";
				definition = "Type of entity.";
				trace_lazy = () -> PartyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyType11Code.Acceptor, com.tools20022.repository.codeset.PartyType11Code.Acquirer, com.tools20022.repository.codeset.PartyType11Code.CardIssuer,
						com.tools20022.repository.codeset.PartyType11Code.DelegateIssuer, com.tools20022.repository.codeset.PartyType11Code.IntermediaryAgent, com.tools20022.repository.codeset.PartyType11Code.OriginatingTerminal,
						com.tools20022.repository.codeset.PartyType11Code.CardApplication);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Acceptor.getCodeName().get(), Acceptor);
		codesByName.put(Acquirer.getCodeName().get(), Acquirer);
		codesByName.put(CardIssuer.getCodeName().get(), CardIssuer);
		codesByName.put(DelegateIssuer.getCodeName().get(), DelegateIssuer);
		codesByName.put(IntermediaryAgent.getCodeName().get(), IntermediaryAgent);
		codesByName.put(OriginatingTerminal.getCodeName().get(), OriginatingTerminal);
		codesByName.put(CardApplication.getCodeName().get(), CardApplication);
	}

	public static PartyType11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyType11Code[] values() {
		PartyType11Code[] values = new PartyType11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyType11Code> {
		@Override
		public PartyType11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyType11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}