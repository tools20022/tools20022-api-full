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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification20;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account to or from which a securities entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13#mmIdentification
 * SecuritiesAccount13.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount13#mmType
 * SecuritiesAccount13.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount13#mmName
 * SecuritiesAccount13.mmName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAuditTrailReportV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmSafekeepingAccount
 * IntraPositionMovementConfirmationV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV02#mmSafekeepingAccount
 * IntraPositionMovementConfirmationV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV03#mmSafekeepingAccount
 * IntraPositionMovementConfirmationV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV04#mmSafekeepingAccount
 * IntraPositionMovementConfirmationV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01#mmSafekeepingAccount
 * IntraPositionMovementPostingReportV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV02#mmSafekeepingAccount
 * IntraPositionMovementPostingReportV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV03#mmSafekeepingAccount
 * IntraPositionMovementPostingReportV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV04#mmSafekeepingAccount
 * IntraPositionMovementPostingReportV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV02#mmSafekeepingAccount
 * SecuritiesMessageCancellationAdviceV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV03#mmSafekeepingAccount
 * SecuritiesMessageCancellationAdviceV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04#mmSafekeepingAccount
 * SecuritiesMessageCancellationAdviceV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#mmSafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV01.mmSafekeepingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02#mmSafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV02.mmSafekeepingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03#mmSafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV03.mmSafekeepingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV04#mmSafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV04.mmSafekeepingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01#mmSafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV02#mmSafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03#mmSafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04#mmSafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01#mmSafekeepingAccount
 * SecuritiesTransactionPendingReportV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02#mmSafekeepingAccount
 * SecuritiesTransactionPendingReportV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03#mmSafekeepingAccount
 * SecuritiesTransactionPendingReportV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04#mmSafekeepingAccount
 * SecuritiesTransactionPendingReportV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01#mmSafekeepingAccount
 * SecuritiesTransactionPostingReportV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02#mmSafekeepingAccount
 * SecuritiesTransactionPostingReportV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03#mmSafekeepingAccount
 * SecuritiesTransactionPostingReportV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04#mmSafekeepingAccount
 * SecuritiesTransactionPostingReportV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmSafekeepingAccount
 * IntraPositionMovementInstructionV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02#mmSafekeepingAccount
 * IntraPositionMovementInstructionV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01#mmSafekeepingAccount
 * PortfolioTransferNotificationV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV02#mmSafekeepingAccount
 * PortfolioTransferNotificationV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV02#mmSafekeepingAccount
 * SecuritiesSettlementAllegementRemovalAdviceV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAllegementReportV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV02#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAllegementReportV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01#mmSafekeepingAccount
 * SecuritiesStatementQueryV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV02#mmSafekeepingAccount
 * SecuritiesStatementQueryV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmSafekeepingAccount
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02#mmSafekeepingAccount
 * SecuritiesStatusOrStatementQueryStatusAdviceV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV02#mmSafekeepingAccount
 * SecuritiesTransactionCancellationRequestV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01#mmSafekeepingAccount
 * SecuritiesTransactionStatusQueryV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV02#mmSafekeepingAccount
 * SecuritiesTransactionStatusQueryV02.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03#mmSafekeepingAccount
 * SecuritiesSettlementAllegementRemovalAdviceV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV03#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAllegementReportV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV03#mmSafekeepingAccount
 * SecuritiesStatementQueryV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03#mmSafekeepingAccount
 * SecuritiesStatusOrStatementQueryStatusAdviceV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV03#mmSafekeepingAccount
 * SecuritiesTransactionCancellationRequestV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV03#mmSafekeepingAccount
 * SecuritiesTransactionStatusQueryV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03#mmSafekeepingAccount
 * IntraPositionMovementInstructionV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV03#mmSafekeepingAccount
 * PortfolioTransferNotificationV03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#mmSafekeepingAccount
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
 * mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04#mmSafekeepingAccount
 * SecuritiesTransactionCancellationRequestV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV05#mmSafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV05.mmSafekeepingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#mmSafekeepingAccount
 * SecuritiesTransactionPendingReportV05.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#mmSafekeepingAccount
 * SecuritiesTransactionPostingReportV05.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmSafekeepingAccount
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05#mmSafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV05.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV04#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAllegementReportV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV04#mmSafekeepingAccount
 * SecuritiesStatementQueryV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#mmSafekeepingAccount
 * SecuritiesTransactionPendingReportV06.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV05#mmSafekeepingAccount
 * SecuritiesStatementQueryV05.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06#mmSafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV06.mmSafekeepingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmSafekeepingAccount
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAuditTrailReportV02.mmSafekeepingAccount}</li>
 * </ul>
 * </li>
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
 * "SecuritiesAccount13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a securities entry is made."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22
 * SecuritiesAccount22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24
 * SecuritiesAccount24}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccount13", propOrder = {"identification", "type", "name"})
public class SecuritiesAccount13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1, FIXSynonym: 660, ISO15022Synonym:
	 * :97a::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification for the account between the account owner and the account servicer.”."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount22#mmIdentification
	 * SecuritiesAccount22.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount24#mmIdentification
	 * SecuritiesAccount24.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccount13, Max35Text> mmIdentification = new MMMessageAttribute<SecuritiesAccount13, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount13.mmObject();
			isDerived = false;
			xmlTag = "Id";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1"), new FIXSynonym(this, "660"), new ISO15022Synonym(this, ":97a::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unambiguous identification for the account between the account owner and the account servicer.”.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccount22.mmIdentification, SecuritiesAccount24.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesAccount13 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SecuritiesAccount13 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Tp")
	protected GenericIdentification20 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesAccountType
	 * SecuritiesAccount.mmSecuritiesAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 581, ISO15022Synonym: :97B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of securities account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22#mmType
	 * SecuritiesAccount22.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24#mmType
	 * SecuritiesAccount24.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccount13, Optional<GenericIdentification20>> mmType = new MMMessageAttribute<SecuritiesAccount13, Optional<GenericIdentification20>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmSecuritiesAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount13.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "581"), new ISO15022Synonym(this, ":97B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of securities account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccount22.mmType, SecuritiesAccount24.mmType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public Optional<GenericIdentification20> getValue(SecuritiesAccount13 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(SecuritiesAccount13 obj, Optional<GenericIdentification20> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm")
	protected Max70Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22#mmName
	 * SecuritiesAccount22.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24#mmName
	 * SecuritiesAccount24.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccount13, Optional<Max70Text>> mmName = new MMMessageAttribute<SecuritiesAccount13, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount13.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Description of the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccount22.mmName, SecuritiesAccount24.mmName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(SecuritiesAccount13 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(SecuritiesAccount13 obj, Optional<Max70Text> value) {
			obj.setName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount13.mmIdentification, com.tools20022.repository.msg.SecuritiesAccount13.mmType,
						com.tools20022.repository.msg.SecuritiesAccount13.mmName);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV01.mmSafekeepingAccount, IntraPositionMovementConfirmationV01.mmSafekeepingAccount,
						IntraPositionMovementConfirmationV02.mmSafekeepingAccount, IntraPositionMovementConfirmationV03.mmSafekeepingAccount, IntraPositionMovementConfirmationV04.mmSafekeepingAccount,
						IntraPositionMovementPostingReportV01.mmSafekeepingAccount, IntraPositionMovementPostingReportV02.mmSafekeepingAccount, IntraPositionMovementPostingReportV03.mmSafekeepingAccount,
						IntraPositionMovementPostingReportV04.mmSafekeepingAccount, SecuritiesMessageCancellationAdviceV02.mmSafekeepingAccount, SecuritiesMessageCancellationAdviceV03.mmSafekeepingAccount,
						SecuritiesMessageCancellationAdviceV04.mmSafekeepingAccount, SecuritiesSettlementConditionModificationStatusAdviceV01.mmSafekeepingAccount,
						SecuritiesSettlementConditionModificationStatusAdviceV02.mmSafekeepingAccount, SecuritiesSettlementConditionModificationStatusAdviceV03.mmSafekeepingAccount,
						SecuritiesSettlementConditionModificationStatusAdviceV04.mmSafekeepingAccount, SecuritiesSettlementConditionsModificationRequestV01.mmSafekeepingAccount,
						SecuritiesSettlementConditionsModificationRequestV02.mmSafekeepingAccount, SecuritiesSettlementConditionsModificationRequestV03.mmSafekeepingAccount,
						SecuritiesSettlementConditionsModificationRequestV04.mmSafekeepingAccount, SecuritiesTransactionPendingReportV01.mmSafekeepingAccount, SecuritiesTransactionPendingReportV02.mmSafekeepingAccount,
						SecuritiesTransactionPendingReportV03.mmSafekeepingAccount, SecuritiesTransactionPendingReportV04.mmSafekeepingAccount, SecuritiesTransactionPostingReportV01.mmSafekeepingAccount,
						SecuritiesTransactionPostingReportV02.mmSafekeepingAccount, SecuritiesTransactionPostingReportV03.mmSafekeepingAccount, SecuritiesTransactionPostingReportV04.mmSafekeepingAccount,
						IntraPositionMovementInstructionV01.mmSafekeepingAccount, IntraPositionMovementInstructionV02.mmSafekeepingAccount, PortfolioTransferNotificationV01.mmSafekeepingAccount,
						PortfolioTransferNotificationV02.mmSafekeepingAccount, SecuritiesSettlementAllegementRemovalAdviceV02.mmSafekeepingAccount, SecuritiesSettlementTransactionAllegementReportV01.mmSafekeepingAccount,
						SecuritiesSettlementTransactionAllegementReportV02.mmSafekeepingAccount, SecuritiesStatementQueryV01.mmSafekeepingAccount, SecuritiesStatementQueryV02.mmSafekeepingAccount,
						SecuritiesStatusOrStatementQueryStatusAdviceV01.mmSafekeepingAccount, SecuritiesStatusOrStatementQueryStatusAdviceV02.mmSafekeepingAccount, SecuritiesTransactionCancellationRequestV02.mmSafekeepingAccount,
						SecuritiesTransactionStatusQueryV01.mmSafekeepingAccount, SecuritiesTransactionStatusQueryV02.mmSafekeepingAccount, SecuritiesSettlementAllegementRemovalAdviceV03.mmSafekeepingAccount,
						SecuritiesSettlementTransactionAllegementReportV03.mmSafekeepingAccount, SecuritiesStatementQueryV03.mmSafekeepingAccount, SecuritiesStatusOrStatementQueryStatusAdviceV03.mmSafekeepingAccount,
						SecuritiesTransactionCancellationRequestV03.mmSafekeepingAccount, SecuritiesTransactionStatusQueryV03.mmSafekeepingAccount, IntraPositionMovementInstructionV03.mmSafekeepingAccount,
						PortfolioTransferNotificationV03.mmSafekeepingAccount, SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmSafekeepingAccount, SecuritiesTransactionCancellationRequestV04.mmSafekeepingAccount,
						SecuritiesSettlementConditionModificationStatusAdviceV05.mmSafekeepingAccount, SecuritiesTransactionPendingReportV05.mmSafekeepingAccount, SecuritiesTransactionPostingReportV05.mmSafekeepingAccount,
						SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmSafekeepingAccount, SecuritiesSettlementConditionsModificationRequestV05.mmSafekeepingAccount,
						SecuritiesSettlementTransactionAllegementReportV04.mmSafekeepingAccount, SecuritiesStatementQueryV04.mmSafekeepingAccount, SecuritiesTransactionPendingReportV06.mmSafekeepingAccount,
						SecuritiesStatementQueryV05.mmSafekeepingAccount, SecuritiesSettlementConditionModificationStatusAdviceV06.mmSafekeepingAccount,
						SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmSafekeepingAccount, SecuritiesSettlementTransactionAuditTrailReportV02.mmSafekeepingAccount);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccount13";
				definition = "Account to or from which a securities entry is made.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesAccount22.mmObject(), SecuritiesAccount24.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public SecuritiesAccount13 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<GenericIdentification20> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public SecuritiesAccount13 setType(GenericIdentification20 type) {
		this.type = type;
		return this;
	}

	public Optional<Max70Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public SecuritiesAccount13 setName(Max70Text name) {
		this.name = name;
		return this;
	}
}