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
import com.tools20022.repository.codeset.PartyType16Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType16Code#Acquirer
 * PartyType16Code.Acquirer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType16Code#CardIssuer
 * PartyType16Code.CardIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType16Code#DelegateIssuer
 * PartyType16Code.DelegateIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType16Code#IntermediaryAgent
 * PartyType16Code.IntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType16Code#OriginatingTerminal
 * PartyType16Code.OriginatingTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType16Code#AccountFromBank
 * PartyType16Code.AccountFromBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType16Code#AccountToBank
 * PartyType16Code.AccountToBank}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType16Code#ATMManager
 * PartyType16Code.ATMManager}</li>
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
 * "PartyType16Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the entity which initially sets the authorisation response value."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.PartyType13Code
 * PartyType13Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyType16Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code
	 * PartyType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType13Code#Acquirer
	 * PartyType13Code.Acquirer}</li>
	 * </ul>
	 */
	public static final PartyType16Code Acquirer = new PartyType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			previousVersion_lazy = () -> PartyType13Code.Acquirer;
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType16Code.mmObject();
			codeName = PartyTypeCode.Acquirer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code
	 * PartyType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType13Code#CardIssuer
	 * PartyType13Code.CardIssuer}</li>
	 * </ul>
	 */
	public static final PartyType16Code CardIssuer = new PartyType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuer";
			previousVersion_lazy = () -> PartyType13Code.CardIssuer;
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType16Code.mmObject();
			codeName = PartyTypeCode.CardIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code
	 * PartyType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegateIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType13Code#DelegateIssuer
	 * PartyType13Code.DelegateIssuer}</li>
	 * </ul>
	 */
	public static final PartyType16Code DelegateIssuer = new PartyType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegateIssuer";
			previousVersion_lazy = () -> PartyType13Code.DelegateIssuer;
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType16Code.mmObject();
			codeName = PartyTypeCode.DelegateIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code
	 * PartyType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType13Code#IntermediaryAgent
	 * PartyType13Code.IntermediaryAgent}</li>
	 * </ul>
	 */
	public static final PartyType16Code IntermediaryAgent = new PartyType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent";
			previousVersion_lazy = () -> PartyType13Code.IntermediaryAgent;
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType16Code.mmObject();
			codeName = PartyTypeCode.IntermediaryAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code
	 * PartyType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingTerminal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType13Code#OriginatingTerminal
	 * PartyType13Code.OriginatingTerminal}</li>
	 * </ul>
	 */
	public static final PartyType16Code OriginatingTerminal = new PartyType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingTerminal";
			previousVersion_lazy = () -> PartyType13Code.OriginatingTerminal;
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType16Code.mmObject();
			codeName = PartyTypeCode.OriginatingTerminal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code
	 * PartyType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountFromBank"</li>
	 * </ul>
	 */
	public static final PartyType16Code AccountFromBank = new PartyType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountFromBank";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType16Code.mmObject();
			codeName = PartyTypeCode.AccountFromBank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code
	 * PartyType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountToBank"</li>
	 * </ul>
	 */
	public static final PartyType16Code AccountToBank = new PartyType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountToBank";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType16Code.mmObject();
			codeName = PartyTypeCode.AccountToBank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code
	 * PartyType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMManager"</li>
	 * </ul>
	 */
	public static final PartyType16Code ATMManager = new PartyType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManager";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType16Code.mmObject();
			codeName = PartyTypeCode.ATMManager.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PartyType16Code> codesByName = new LinkedHashMap<>();

	protected PartyType16Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyType16Code";
				definition = "Identifies the entity which initially sets the authorisation response value.";
				previousVersion_lazy = () -> PartyType13Code.mmObject();
				trace_lazy = () -> PartyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyType16Code.Acquirer, com.tools20022.repository.codeset.PartyType16Code.CardIssuer, com.tools20022.repository.codeset.PartyType16Code.DelegateIssuer,
						com.tools20022.repository.codeset.PartyType16Code.IntermediaryAgent, com.tools20022.repository.codeset.PartyType16Code.OriginatingTerminal, com.tools20022.repository.codeset.PartyType16Code.AccountFromBank,
						com.tools20022.repository.codeset.PartyType16Code.AccountToBank, com.tools20022.repository.codeset.PartyType16Code.ATMManager);
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
		codesByName.put(AccountFromBank.getCodeName().get(), AccountFromBank);
		codesByName.put(AccountToBank.getCodeName().get(), AccountToBank);
		codesByName.put(ATMManager.getCodeName().get(), ATMManager);
	}

	public static PartyType16Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyType16Code[] values() {
		PartyType16Code[] values = new PartyType16Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyType16Code> {
		@Override
		public PartyType16Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyType16Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}