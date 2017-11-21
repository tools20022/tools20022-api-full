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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.ModificationProcessingStatus2Choice;
import com.tools20022.repository.choice.PartyIdentification36Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * Scope An account servicer sends a
 * SecuritiesSettlementTransactionModificationRequestStatusAdvice to an account
 * owner to advise the status of a SecuritiesSettlementModificationRequest
 * message previously sent by the account owner. The account servicer may be: -
 * a central securities depository or another settlement market infrastructure
 * managing securities settlement transactions on behalf of their participants -
 * an custodian acting as an accounting and/or settlement agent.
 * 
 * Usage The message may also be used to: - re-send a message sent by the
 * account owner to the account servicer, - provide a third party with a copy of
 * a message being sent by the account owner for information, - re-send to a
 * third party a copy of a message being sent by the account owner for
 * information using the relevant elements in the Business Application Header.
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxModReqStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmModificationRequestReference
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * mmModificationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmAccountOwner
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmSafekeepingAccount
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmTransactionIdentification
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmModificationProcessingStatus
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmTransactionDetails
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmSupplementaryData
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.039.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionModificationRequestStatusAdviceV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends a SecuritiesSettlementTransactionModificationRequestStatusAdvice to an account owner to advise the status of a SecuritiesSettlementModificationRequest message previously sent by the account owner.\nThe account servicer may be:\n- a central securities depository or another settlement market infrastructure managing securities settlement transactions on behalf of their participants\n- an custodian acting as an accounting and/or settlement agent.\n\nUsage\nThe message may also be used to:\n- re-send a message sent by the account owner to the account servicer,\n- provide a third party with a copy of a message being sent by the account owner for information,\n- re-send to a third party a copy of a message being sent by the account owner for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesSettlementTransactionModificationRequestStatusAdviceV02", propOrder = {"modificationRequestReference", "accountOwner", "safekeepingAccount", "transactionIdentification", "modificationProcessingStatus",
		"transactionDetails", "supplementaryData"})
public class SecuritiesSettlementTransactionModificationRequestStatusAdviceV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Identification1 modificationRequestReference;
	/**
	 * Reference to the unambiguous identification of the cancellation request
	 * as per the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Identification1
	 * Identification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModReqRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationRequestReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the unambiguous identification of the cancellation request as per the account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmModificationRequestReference
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
	 * mmModificationRequestReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#mmModificationRequestReference
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
	 * mmModificationRequestReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModificationRequestReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModReqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequestReference";
			definition = "Reference to the unambiguous identification of the cancellation request as per the account owner.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmModificationRequestReference);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmModificationRequestReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Identification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.class.getMethod("getModificationRequestReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification36Choice accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmAccountOwner
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
	 * mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#mmAccountOwner
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
	 * mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountOwner = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmAccountOwner);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification36Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.class.getMethod("getAccountOwner", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount13 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmSafekeepingAccount
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
	 * mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#mmSafekeepingAccount
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
	 * mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSafekeepingAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmSafekeepingAccount);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount13.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.class.getMethod("getSafekeepingAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransactionIdentifications25 transactionIdentification;
	/**
	 * Provides unambiguous transaction identification information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications25
	 * TransactionIdentifications25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides unambiguous transaction identification information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmTransactionIdentification
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#mmTransactionIdentification
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Provides unambiguous transaction identification information.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmTransactionIdentification);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionIdentifications25.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ModificationProcessingStatus2Choice modificationProcessingStatus;
	/**
	 * Provides details on the processing status of the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice
	 * ModificationProcessingStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the processing status of the request."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmModificationProcessingStatus
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
	 * mmModificationProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#mmModificationProcessingStatus
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
	 * mmModificationProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModificationProcessingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides details on the processing status of the request.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmModificationProcessingStatus);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmModificationProcessingStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ModificationProcessingStatus2Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.class.getMethod("getModificationProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransactionDetails45 transactionDetails;
	/**
	 * Identifies the details of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45
	 * TransactionDetails45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the details of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmTransactionDetails
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
	 * mmTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#mmTransactionDetails
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
	 * mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmTransactionDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmTransactionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionDetails45.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.class.getMethod("getTransactionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmSupplementaryData
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
	 * mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#mmSupplementaryData
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
	 * mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmSupplementaryData);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionModificationRequestStatusAdviceV02";
				definition = "Scope\nAn account servicer sends a SecuritiesSettlementTransactionModificationRequestStatusAdvice to an account owner to advise the status of a SecuritiesSettlementModificationRequest message previously sent by the account owner.\nThe account servicer may be:\n- a central securities depository or another settlement market infrastructure managing securities settlement transactions on behalf of their participants\n- an custodian acting as an accounting and/or settlement agent.\n\nUsage\nThe message may also be used to:\n- re-send a message sent by the account owner to the account servicer,\n- provide a third party with a copy of a message being sent by the account owner for information,\n- re-send to a third party a copy of a message being sent by the account owner for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmObject());
				previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxModReqStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmModificationRequestReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmAccountOwner,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmSafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmModificationProcessingStatus,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "039";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ModReqRef", required = true)
	public Identification1 getModificationRequestReference() {
		return modificationRequestReference;
	}

	public void setModificationRequestReference(Identification1 modificationRequestReference) {
		this.modificationRequestReference = modificationRequestReference;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification36Choice getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(PartyIdentification36Choice accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "SfkpgAcct", required = true)
	public SecuritiesAccount13 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount13 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "TxId")
	public TransactionIdentifications25 getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(TransactionIdentifications25 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "ModPrcgSts", required = true)
	public ModificationProcessingStatus2Choice getModificationProcessingStatus() {
		return modificationProcessingStatus;
	}

	public void setModificationProcessingStatus(ModificationProcessingStatus2Choice modificationProcessingStatus) {
		this.modificationProcessingStatus = modificationProcessingStatus;
	}

	@XmlElement(name = "TxDtls")
	public TransactionDetails45 getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(TransactionDetails45 transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.039.02.02")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxModReqStsAdvc", required = true)
		public SecuritiesSettlementTransactionModificationRequestStatusAdviceV02 messageBody;
	}
}