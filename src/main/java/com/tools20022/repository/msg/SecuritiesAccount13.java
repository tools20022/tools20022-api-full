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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.SecuritiesAccount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13#Identification
 * SecuritiesAccount13.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount13#Type
 * SecuritiesAccount13.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount13#Name
 * SecuritiesAccount13.Name}</li>
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
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#SafekeepingAccount
 * SecuritiesSettlementTransactionAuditTrailReportV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#SafekeepingAccount
 * IntraPositionMovementConfirmationV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV02#SafekeepingAccount
 * IntraPositionMovementConfirmationV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV03#SafekeepingAccount
 * IntraPositionMovementConfirmationV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV04#SafekeepingAccount
 * IntraPositionMovementConfirmationV04.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01#SafekeepingAccount
 * IntraPositionMovementPostingReportV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV02#SafekeepingAccount
 * IntraPositionMovementPostingReportV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV03#SafekeepingAccount
 * IntraPositionMovementPostingReportV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV04#SafekeepingAccount
 * IntraPositionMovementPostingReportV04.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV02#SafekeepingAccount
 * SecuritiesMessageCancellationAdviceV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV03#SafekeepingAccount
 * SecuritiesMessageCancellationAdviceV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04#SafekeepingAccount
 * SecuritiesMessageCancellationAdviceV04.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#SafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02#SafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03#SafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV04#SafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV04.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01#SafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV02#SafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03#SafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04#SafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV04.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01#SafekeepingAccount
 * SecuritiesTransactionPendingReportV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02#SafekeepingAccount
 * SecuritiesTransactionPendingReportV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03#SafekeepingAccount
 * SecuritiesTransactionPendingReportV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04#SafekeepingAccount
 * SecuritiesTransactionPendingReportV04.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01#SafekeepingAccount
 * SecuritiesTransactionPostingReportV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02#SafekeepingAccount
 * SecuritiesTransactionPostingReportV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03#SafekeepingAccount
 * SecuritiesTransactionPostingReportV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04#SafekeepingAccount
 * SecuritiesTransactionPostingReportV04.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#SafekeepingAccount
 * IntraPositionMovementInstructionV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02#SafekeepingAccount
 * IntraPositionMovementInstructionV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01#SafekeepingAccount
 * PortfolioTransferNotificationV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV02#SafekeepingAccount
 * PortfolioTransferNotificationV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV02#SafekeepingAccount
 * SecuritiesSettlementAllegementRemovalAdviceV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01#SafekeepingAccount
 * SecuritiesSettlementTransactionAllegementReportV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV02#SafekeepingAccount
 * SecuritiesSettlementTransactionAllegementReportV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01#SafekeepingAccount
 * SecuritiesStatementQueryV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV02#SafekeepingAccount
 * SecuritiesStatementQueryV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#SafekeepingAccount
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02#SafekeepingAccount
 * SecuritiesStatusOrStatementQueryStatusAdviceV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV02#SafekeepingAccount
 * SecuritiesTransactionCancellationRequestV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01#SafekeepingAccount
 * SecuritiesTransactionStatusQueryV01.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV02#SafekeepingAccount
 * SecuritiesTransactionStatusQueryV02.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03#SafekeepingAccount
 * SecuritiesSettlementAllegementRemovalAdviceV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV03#SafekeepingAccount
 * SecuritiesSettlementTransactionAllegementReportV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV03#SafekeepingAccount
 * SecuritiesStatementQueryV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03#SafekeepingAccount
 * SecuritiesStatusOrStatementQueryStatusAdviceV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV03#SafekeepingAccount
 * SecuritiesTransactionCancellationRequestV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV03#SafekeepingAccount
 * SecuritiesTransactionStatusQueryV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03#SafekeepingAccount
 * IntraPositionMovementInstructionV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV03#SafekeepingAccount
 * PortfolioTransferNotificationV03.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#SafekeepingAccount
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
 * SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04#SafekeepingAccount
 * SecuritiesTransactionCancellationRequestV04.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV05#SafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV05.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#SafekeepingAccount
 * SecuritiesTransactionPendingReportV05.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#SafekeepingAccount
 * SecuritiesTransactionPostingReportV05.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#SafekeepingAccount
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05#SafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV05.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV04#SafekeepingAccount
 * SecuritiesSettlementTransactionAllegementReportV04.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV04#SafekeepingAccount
 * SecuritiesStatementQueryV04.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#SafekeepingAccount
 * SecuritiesTransactionPendingReportV06.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV05#SafekeepingAccount
 * SecuritiesStatementQueryV05.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06#SafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV06.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#SafekeepingAccount
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#SafekeepingAccount
 * SecuritiesSettlementTransactionAuditTrailReportV02.SafekeepingAccount}</li>
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
public class SecuritiesAccount13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous identification for the account between the account owner and
	 * the account servicer.”
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification for the account between the account owner and the account servicer.”"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount22#Identification
	 * SecuritiesAccount22.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount24#Identification
	 * SecuritiesAccount24.Identification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesAccount13.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unambiguous identification for the account between the account owner and the account servicer.”";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount22.Identification, com.tools20022.repository.msg.SecuritiesAccount24.Identification);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of securities account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesAccountType
	 * SecuritiesAccount.SecuritiesAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22#Type
	 * SecuritiesAccount22.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24#Type
	 * SecuritiesAccount24.Type}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesAccount13.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.SecuritiesAccountType;
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of securities account.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount22.Type, com.tools20022.repository.msg.SecuritiesAccount24.Type);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> GenericIdentification20.mmObject();
		}
	};
	/**
	 * Description of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#Name
	 * AccountIdentification.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22#Name
	 * SecuritiesAccount22.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24#Name
	 * SecuritiesAccount24.Name}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Name = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesAccount13.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountIdentification.Name;
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Description of the account.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount22.Name, com.tools20022.repository.msg.SecuritiesAccount24.Name);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount13.Identification, com.tools20022.repository.msg.SecuritiesAccount13.Type, com.tools20022.repository.msg.SecuritiesAccount13.Name);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01.SafekeepingAccount,
						com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.SafekeepingAccount, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV02.SafekeepingAccount,
						com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV03.SafekeepingAccount, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV04.SafekeepingAccount,
						com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01.SafekeepingAccount, com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV02.SafekeepingAccount,
						com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV03.SafekeepingAccount, com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV04.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV02.SafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV03.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04.SafekeepingAccount, com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV04.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV02.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04.SafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02.SafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04.SafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02.SafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04.SafekeepingAccount, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.SafekeepingAccount,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02.SafekeepingAccount, com.tools20022.repository.area.sese.PortfolioTransferNotificationV01.SafekeepingAccount,
						com.tools20022.repository.area.sese.PortfolioTransferNotificationV02.SafekeepingAccount, com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV02.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01.SafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV02.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesStatementQueryV01.SafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesStatementQueryV02.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.SafekeepingAccount, com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV02.SafekeepingAccount, com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV02.SafekeepingAccount, com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV03.SafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesStatementQueryV03.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03.SafekeepingAccount, com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV03.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV03.SafekeepingAccount, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03.SafekeepingAccount,
						com.tools20022.repository.area.sese.PortfolioTransferNotificationV03.SafekeepingAccount, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04.SafekeepingAccount, com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV05.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05.SafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05.SafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV04.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesStatementQueryV04.SafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesStatementQueryV05.SafekeepingAccount, com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06.SafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.SafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02.SafekeepingAccount);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccount13";
				definition = "Account to or from which a securities entry is made.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesAccount22.mmObject(), SecuritiesAccount24.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}