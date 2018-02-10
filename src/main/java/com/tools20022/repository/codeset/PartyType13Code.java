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
import com.tools20022.repository.codeset.PartyType13Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the entity which initially sets the authorisation response value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType13Code#Acquirer
 * PartyType13Code.Acquirer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType13Code#CardIssuer
 * PartyType13Code.CardIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType13Code#DelegateIssuer
 * PartyType13Code.DelegateIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType13Code#IntermediaryAgent
 * PartyType13Code.IntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType13Code#OriginatingTerminal
 * PartyType13Code.OriginatingTerminal}</li>
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
 * "PartyType13Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the entity which initially sets the authorisation response value."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType16Code
 * PartyType16Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyType13Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType13Code
	 * PartyType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code#Acquirer
	 * PartyType16Code.Acquirer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PartyType13Code Acquirer = new PartyType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			nextVersions_lazy = () -> Arrays.asList(PartyType16Code.Acquirer);
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType13Code.mmObject();
			codeName = PartyTypeCode.Acquirer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType13Code
	 * PartyType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code#CardIssuer
	 * PartyType16Code.CardIssuer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PartyType13Code CardIssuer = new PartyType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuer";
			nextVersions_lazy = () -> Arrays.asList(PartyType16Code.CardIssuer);
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType13Code.mmObject();
			codeName = PartyTypeCode.CardIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType13Code
	 * PartyType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegateIssuer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code#DelegateIssuer
	 * PartyType16Code.DelegateIssuer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PartyType13Code DelegateIssuer = new PartyType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegateIssuer";
			nextVersions_lazy = () -> Arrays.asList(PartyType16Code.DelegateIssuer);
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType13Code.mmObject();
			codeName = PartyTypeCode.DelegateIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType13Code
	 * PartyType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code#IntermediaryAgent
	 * PartyType16Code.IntermediaryAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PartyType13Code IntermediaryAgent = new PartyType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent";
			nextVersions_lazy = () -> Arrays.asList(PartyType16Code.IntermediaryAgent);
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType13Code.mmObject();
			codeName = PartyTypeCode.IntermediaryAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType13Code
	 * PartyType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingTerminal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code#OriginatingTerminal
	 * PartyType16Code.OriginatingTerminal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PartyType13Code OriginatingTerminal = new PartyType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingTerminal";
			nextVersions_lazy = () -> Arrays.asList(PartyType16Code.OriginatingTerminal);
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType13Code.mmObject();
			codeName = PartyTypeCode.OriginatingTerminal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PartyType13Code> codesByName = new LinkedHashMap<>();

	protected PartyType13Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyType13Code";
				definition = "Identifies the entity which initially sets the authorisation response value.";
				nextVersions_lazy = () -> Arrays.asList(PartyType16Code.mmObject());
				trace_lazy = () -> PartyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyType13Code.Acquirer, com.tools20022.repository.codeset.PartyType13Code.CardIssuer, com.tools20022.repository.codeset.PartyType13Code.DelegateIssuer,
						com.tools20022.repository.codeset.PartyType13Code.IntermediaryAgent, com.tools20022.repository.codeset.PartyType13Code.OriginatingTerminal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Acquirer.getCodeName().get(), Acquirer);
		codesByName.put(CardIssuer.getCodeName().get(), CardIssuer);
		codesByName.put(DelegateIssuer.getCodeName().get(), DelegateIssuer);
		codesByName.put(IntermediaryAgent.getCodeName().get(), IntermediaryAgent);
		codesByName.put(OriginatingTerminal.getCodeName().get(), OriginatingTerminal);
	}

	public static PartyType13Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyType13Code[] values() {
		PartyType13Code[] values = new PartyType13Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyType13Code> {
		@Override
		public PartyType13Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyType13Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}