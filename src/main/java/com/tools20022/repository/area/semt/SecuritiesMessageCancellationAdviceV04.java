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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementPreviousVersion;
import com.tools20022.repository.choice.PartyIdentification36Choice;
import com.tools20022.repository.choice.References37Choice;
import com.tools20022.repository.msg.SecuritiesAccount13;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOPreviousversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An account servicer sends a SecuritiesMessageCancellationAdvice to an
 * account owner to inform of the cancellation of a securities message
 * previously sent by an account servicer. The account servicer/owner
 * relationship may be: - a central securities depository or another settlement
 * market infrastructure acting on behalf of their participants - an agent
 * (sub-custodian) acting on behalf of their global custodian customer, or - a
 * custodian acting on behalf of an investment management institution or a
 * broker/dealer.
 * 
 * Usage The previously sent message may be: - a securities settlement
 * transaction confirmation - a report (transactions, pending transactions,
 * allegements, accounting and custody securities balance) - a allegement
 * notification (when sent by mistake or because the counterparty cancelled its
 * instruction) - a portfolio transfer notification - an intra-position movement
 * confirmation - a transaction generation notification The previously sent
 * message cannot be a status advice message (any). If a status advice should
 * not have been sent, a new status advice with the correct status should be
 * sent, not a cancellation advice. The message may also be used to: - re-send a
 * message previously sent, - provide a third party with a copy of a message for
 * information, - re-send to a third party a copy of a message for information
 * using the relevant elements in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.020.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementPreviousVersion
 * SecuritiesManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04#mmReference
 * SecuritiesMessageCancellationAdviceV04.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04#mmAccountOwner
 * SecuritiesMessageCancellationAdviceV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04#mmSafekeepingAccount
 * SecuritiesMessageCancellationAdviceV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04#mmSupplementaryData
 * SecuritiesMessageCancellationAdviceV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOPreviousversion
 * SettlementAndReconciliationISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesMsgCxlAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesMessageCancellationAdviceV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends a SecuritiesMessageCancellationAdvice to an account owner to inform of the cancellation of a securities message previously sent by an account servicer. \nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or \n- a custodian acting on behalf of an investment management institution or a broker/dealer.\n\nUsage\nThe previously sent message may be:\n- a securities settlement transaction confirmation\n- a report (transactions, pending transactions, allegements, accounting and custody securities balance)\n- a allegement notification (when sent by mistake or because the counterparty cancelled its instruction)\n- a portfolio transfer notification \n- an intra-position movement confirmation\n- a transaction generation notification\nThe previously sent message cannot be a status advice message (any). If a status advice should not have been sent, a new status advice with the correct status should be sent, not a cancellation advice.\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesMessageCancellationAdviceV04
 * ConstraintCoexistenceCharacterSetXRule.
 * for_semt_SecuritiesMessageCancellationAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_semt_SecuritiesMessageCancellationAdviceV04
 * ConstraintCoexistenceIdentificationRule.
 * for_semt_SecuritiesMessageCancellationAdviceV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV05
 * SecuritiesMessageCancellationAdviceV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV03
 * SecuritiesMessageCancellationAdviceV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesMessageCancellationAdviceV04", propOrder = {"reference", "accountOwner", "safekeepingAccount", "supplementaryData"})
public class SecuritiesMessageCancellationAdviceV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ref", required = true)
	protected References37Choice reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.References37Choice
	 * References37Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the message advised to be cancelled by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV05#mmReference
	 * SecuritiesMessageCancellationAdviceV05.mmReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesMessageCancellationAdviceV04, References37Choice> mmReference = new MMMessageBuildingBlock<SecuritiesMessageCancellationAdviceV04, References37Choice>() {
		{
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference to the message advised to be cancelled by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesMessageCancellationAdviceV05.mmReference);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> References37Choice.mmObject();
		}

		@Override
		public References37Choice getValue(SecuritiesMessageCancellationAdviceV04 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(SecuritiesMessageCancellationAdviceV04 obj, References37Choice value) {
			obj.setReference(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification36Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV05#mmAccountOwner
	 * SecuritiesMessageCancellationAdviceV05.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesMessageCancellationAdviceV04, Optional<PartyIdentification36Choice>> mmAccountOwner = new MMMessageBuildingBlock<SecuritiesMessageCancellationAdviceV04, Optional<PartyIdentification36Choice>>() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesMessageCancellationAdviceV05.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification36Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification36Choice> getValue(SecuritiesMessageCancellationAdviceV04 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SecuritiesMessageCancellationAdviceV04 obj, Optional<PartyIdentification36Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount13 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV05#mmSafekeepingAccount
	 * SecuritiesMessageCancellationAdviceV05.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesMessageCancellationAdviceV04, SecuritiesAccount13> mmSafekeepingAccount = new MMMessageBuildingBlock<SecuritiesMessageCancellationAdviceV04, SecuritiesAccount13>() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesMessageCancellationAdviceV05.mmSafekeepingAccount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public SecuritiesAccount13 getValue(SecuritiesMessageCancellationAdviceV04 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(SecuritiesMessageCancellationAdviceV04 obj, SecuritiesAccount13 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV05#mmSupplementaryData
	 * SecuritiesMessageCancellationAdviceV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesMessageCancellationAdviceV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesMessageCancellationAdviceV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesMessageCancellationAdviceV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesMessageCancellationAdviceV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesMessageCancellationAdviceV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesMessageCancellationAdviceV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_semt_SecuritiesMessageCancellationAdviceV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesMessageCancellationAdviceV04";
				definition = "Scope\nAn account servicer sends a SecuritiesMessageCancellationAdvice to an account owner to inform of the cancellation of a securities message previously sent by an account servicer. \nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or \n- a custodian acting on behalf of an investment management institution or a broker/dealer.\n\nUsage\nThe previously sent message may be:\n- a securities settlement transaction confirmation\n- a report (transactions, pending transactions, allegements, accounting and custody securities balance)\n- a allegement notification (when sent by mistake or because the counterparty cancelled its instruction)\n- a portfolio transfer notification \n- an intra-position movement confirmation\n- a transaction generation notification\nThe previously sent message cannot be a status advice message (any). If a status advice should not have been sent, a new status advice with the correct status should be sent, not a cancellation advice.\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesMessageCancellationAdviceV05.mmObject());
				previousVersion_lazy = () -> SecuritiesMessageCancellationAdviceV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesMsgCxlAdvc";
				businessArea_lazy = () -> SecuritiesManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04.mmReference,
						com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04.mmAccountOwner, com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04.mmSafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "020";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesMessageCancellationAdviceV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public References37Choice getReference() {
		return reference;
	}

	public SecuritiesMessageCancellationAdviceV04 setReference(References37Choice reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SecuritiesMessageCancellationAdviceV04 setAccountOwner(PartyIdentification36Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public SecuritiesMessageCancellationAdviceV04 setSafekeepingAccount(SecuritiesAccount13 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesMessageCancellationAdviceV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.020.001.04")
	static public class Document {
		@XmlElement(name = "SctiesMsgCxlAdvc", required = true)
		public SecuritiesMessageCancellationAdviceV04 messageBody;
	}
}