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
import com.tools20022.repository.codeset.PartyType5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identification of the type of entity involved in a maintenance operation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType5Code#OriginatingPOI
 * PartyType5Code.OriginatingPOI}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType5Code#Acceptor
 * PartyType5Code.Acceptor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType5Code#Merchant
 * PartyType5Code.Merchant}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType5Code#Acquirer
 * PartyType5Code.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType5Code#IntermediaryAgent
 * PartyType5Code.IntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType5Code#MasterTerminalManager
 * PartyType5Code.MasterTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType5Code#TerminalManager
 * PartyType5Code.TerminalManager}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode PartyTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPOI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the type of entity involved in a maintenance operation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType5Code
	 * PartyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingPOI"</li>
	 * </ul>
	 */
	public static final PartyType5Code OriginatingPOI = new PartyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingPOI";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType5Code.mmObject();
			codeName = PartyTypeCode.OriginatingPOI.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType5Code
	 * PartyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acceptor"</li>
	 * </ul>
	 */
	public static final PartyType5Code Acceptor = new PartyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acceptor";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType5Code.mmObject();
			codeName = PartyTypeCode.Acceptor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType5Code
	 * PartyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * </ul>
	 */
	public static final PartyType5Code Merchant = new PartyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType5Code.mmObject();
			codeName = PartyTypeCode.Merchant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType5Code
	 * PartyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * </ul>
	 */
	public static final PartyType5Code Acquirer = new PartyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType5Code.mmObject();
			codeName = PartyTypeCode.Acquirer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType5Code
	 * PartyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * </ul>
	 */
	public static final PartyType5Code IntermediaryAgent = new PartyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType5Code.mmObject();
			codeName = PartyTypeCode.IntermediaryAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType5Code
	 * PartyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTerminalManager"</li>
	 * </ul>
	 */
	public static final PartyType5Code MasterTerminalManager = new PartyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTerminalManager";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType5Code.mmObject();
			codeName = PartyTypeCode.MasterTerminalManager.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType5Code
	 * PartyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManager"</li>
	 * </ul>
	 */
	public static final PartyType5Code TerminalManager = new PartyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManager";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType5Code.mmObject();
			codeName = PartyTypeCode.TerminalManager.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PartyType5Code> codesByName = new LinkedHashMap<>();

	protected PartyType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPOI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyType5Code";
				definition = "Identification of the type of entity involved in a maintenance operation.";
				trace_lazy = () -> PartyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyType5Code.OriginatingPOI, com.tools20022.repository.codeset.PartyType5Code.Acceptor, com.tools20022.repository.codeset.PartyType5Code.Merchant,
						com.tools20022.repository.codeset.PartyType5Code.Acquirer, com.tools20022.repository.codeset.PartyType5Code.IntermediaryAgent, com.tools20022.repository.codeset.PartyType5Code.MasterTerminalManager,
						com.tools20022.repository.codeset.PartyType5Code.TerminalManager);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OriginatingPOI.getCodeName().get(), OriginatingPOI);
		codesByName.put(Acceptor.getCodeName().get(), Acceptor);
		codesByName.put(Merchant.getCodeName().get(), Merchant);
		codesByName.put(Acquirer.getCodeName().get(), Acquirer);
		codesByName.put(IntermediaryAgent.getCodeName().get(), IntermediaryAgent);
		codesByName.put(MasterTerminalManager.getCodeName().get(), MasterTerminalManager);
		codesByName.put(TerminalManager.getCodeName().get(), TerminalManager);
	}

	public static PartyType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyType5Code[] values() {
		PartyType5Code[] values = new PartyType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyType5Code> {
		@Override
		public PartyType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}