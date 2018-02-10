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
import com.tools20022.repository.codeset.CancelledStatusReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the underlying reason for the cancellation of the associated
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#CancelledByYourself
 * CancelledStatusReasonCode.CancelledByYourself}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#CancelledBySystem
 * CancelledStatusReasonCode.CancelledBySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#CancelledByAgent
 * CancelledStatusReasonCode.CancelledByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#Other
 * CancelledStatusReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#CancelledByHub
 * CancelledStatusReasonCode.CancelledByHub}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#CancelledByInstructingParty
 * CancelledStatusReasonCode.CancelledByInstructingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#EndOfLife
 * CancelledStatusReasonCode.EndOfLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#CancelledByOther
 * CancelledStatusReasonCode.CancelledByOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#CancelledByTransferAgent
 * CancelledStatusReasonCode.CancelledByTransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#CancelledByClient
 * CancelledStatusReasonCode.CancelledByClient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#CancelledByIntermediary
 * CancelledStatusReasonCode.CancelledByIntermediary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CancelledStatusReason1Code
 * CancelledStatusReason1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CancelledStatusReason2Code
 * CancelledStatusReason2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationCompleteStatusReason1Code
 * CancellationCompleteStatusReason1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CancelledStatusReason3Code
 * CancelledStatusReason3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CancelledStatusReason8Code
 * CancelledStatusReason8Code}</li>
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
 * <li>"CANI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancelledStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for the cancellation of the associated transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancelledStatusReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is cancelled by yourself.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CAND//CANI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByYourself"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by yourself."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonCode CancelledByYourself = new CancelledStatusReasonCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CAND//CANI"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByYourself";
			definition = "Transaction is cancelled by yourself.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonCode.mmObject();
			codeName = "CANI";
		}
	};
	/**
	 * Transaction is cancelled by the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CAND//CANS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledBySystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the system."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonCode CancelledBySystem = new CancelledStatusReasonCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CAND//CANS"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledBySystem";
			definition = "Transaction is cancelled by the system.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonCode.mmObject();
			codeName = "CANS";
		}
	};
	/**
	 * Transaction is cancelled by the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSUB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CAND//CSUB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the agent."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonCode CancelledByAgent = new CancelledStatusReasonCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CAND//CSUB"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByAgent";
			definition = "Transaction is cancelled by the agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonCode.mmObject();
			codeName = "CSUB";
		}
	};
	/**
	 * Other (see additional information).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CAND//NARR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other (see additional information)."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonCode Other = new CancelledStatusReasonCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CAND//NARR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Other (see additional information).";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Transaction is cancelled by the hub.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByHub"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the hub."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonCode CancelledByHub = new CancelledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByHub";
			definition = "Transaction is cancelled by the hub.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonCode.mmObject();
			codeName = "CANH";
		}
	};
	/**
	 * Transaction is cancelled by the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByInstructingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the instructing party."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonCode CancelledByInstructingParty = new CancelledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByInstructingParty";
			definition = "Transaction is cancelled by the instructing party.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Transaction is rejected by the executing party, the rejection is final
	 * therefore the order is cancelled in the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CXLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system."
	 * </li>
	 * </ul>
	 */
	public static final CancelledStatusReasonCode EndOfLife = new CancelledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfLife";
			definition = "Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonCode.mmObject();
			codeName = "CXLR";
		}
	};
	/**
	 * Transaction is cancelled by a party other than the instructing party, eg,
	 * a market infrastructure such as a stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByOther"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is cancelled by a party other than the instructing party, eg, a market infrastructure such as a stock exchange."
	 * </li>
	 * </ul>
	 */
	public static final CancelledStatusReasonCode CancelledByOther = new CancelledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByOther";
			definition = "Transaction is cancelled by a party other than the instructing party, eg, a market infrastructure such as a stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonCode.mmObject();
			codeName = "CANO";
		}
	};
	/**
	 * Transaction is cancelled by the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByTransferAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the transfer agent."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonCode CancelledByTransferAgent = new CancelledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByTransferAgent";
			definition = "Transaction is cancelled by the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonCode.mmObject();
			codeName = "CNTA";
		}
	};
	/**
	 * Transaction is cancelled by the client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByClient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the client."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonCode CancelledByClient = new CancelledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByClient";
			definition = "Transaction is cancelled by the client.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonCode.mmObject();
			codeName = "CNCL";
		}
	};
	/**
	 * Transaction is cancelled by the intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the intermediary."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonCode CancelledByIntermediary = new CancelledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByIntermediary";
			definition = "Transaction is cancelled by the intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonCode.mmObject();
			codeName = "CNIN";
		}
	};
	final static private LinkedHashMap<String, CancelledStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected CancelledStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CANI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelledStatusReasonCode";
				definition = "Specifies the underlying reason for the cancellation of the associated transaction.";
				derivation_lazy = () -> Arrays.asList(CancelledStatusReason1Code.mmObject(), CancelledStatusReason2Code.mmObject(), CancellationCompleteStatusReason1Code.mmObject(), CancelledStatusReason3Code.mmObject(),
						CancelledStatusReason8Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancelledStatusReasonCode.CancelledByYourself, com.tools20022.repository.codeset.CancelledStatusReasonCode.CancelledBySystem,
						com.tools20022.repository.codeset.CancelledStatusReasonCode.CancelledByAgent, com.tools20022.repository.codeset.CancelledStatusReasonCode.Other,
						com.tools20022.repository.codeset.CancelledStatusReasonCode.CancelledByHub, com.tools20022.repository.codeset.CancelledStatusReasonCode.CancelledByInstructingParty,
						com.tools20022.repository.codeset.CancelledStatusReasonCode.EndOfLife, com.tools20022.repository.codeset.CancelledStatusReasonCode.CancelledByOther,
						com.tools20022.repository.codeset.CancelledStatusReasonCode.CancelledByTransferAgent, com.tools20022.repository.codeset.CancelledStatusReasonCode.CancelledByClient,
						com.tools20022.repository.codeset.CancelledStatusReasonCode.CancelledByIntermediary);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancelledByYourself.getCodeName().get(), CancelledByYourself);
		codesByName.put(CancelledBySystem.getCodeName().get(), CancelledBySystem);
		codesByName.put(CancelledByAgent.getCodeName().get(), CancelledByAgent);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(CancelledByHub.getCodeName().get(), CancelledByHub);
		codesByName.put(CancelledByInstructingParty.getCodeName().get(), CancelledByInstructingParty);
		codesByName.put(EndOfLife.getCodeName().get(), EndOfLife);
		codesByName.put(CancelledByOther.getCodeName().get(), CancelledByOther);
		codesByName.put(CancelledByTransferAgent.getCodeName().get(), CancelledByTransferAgent);
		codesByName.put(CancelledByClient.getCodeName().get(), CancelledByClient);
		codesByName.put(CancelledByIntermediary.getCodeName().get(), CancelledByIntermediary);
	}

	public static CancelledStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancelledStatusReasonCode[] values() {
		CancelledStatusReasonCode[] values = new CancelledStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancelledStatusReasonCode> {
		@Override
		public CancelledStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancelledStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}