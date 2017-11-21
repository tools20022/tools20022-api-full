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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UnderlyingPaymentInstruction1;
import com.tools20022.repository.msg.UnderlyingPaymentTransaction1;
import com.tools20022.repository.msg.UnderlyingStatementEntry1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the details of the underlying transaction on which the
 * investigation is processed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice#mmInitiation
 * UnderlyingTransaction1Choice.mmInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice#mmInterbank
 * UnderlyingTransaction1Choice.mmInterbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice#mmStatementEntry
 * UnderlyingTransaction1Choice.mmStatementEntry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03#mmUnderlying
 * RequestToModifyPaymentV03.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV03#mmUnderlying
 * UnableToApplyV03.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV03#mmUnderlying
 * ClaimNonReceiptV03.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV03#mmUnderlying
 * AdditionalPaymentInformationV03.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV03#mmUnderlying
 * DebitAuthorisationRequestV03.mmUnderlying}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingTransaction1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details of the underlying transaction on which the investigation is processed."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UnderlyingTransaction1Choice", propOrder = {"initiation", "interbank", "statementEntry"})
public class UnderlyingTransaction1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected UnderlyingPaymentInstruction1 initiation;
	/**
	 * Set of elements used to reference the details of the original payment
	 * initiation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1
	 * UnderlyingPaymentInstruction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice
	 * UnderlyingTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Initn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the original payment initiation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitiation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> UnderlyingTransaction1Choice.mmObject();
			isDerived = false;
			xmlTag = "Initn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initiation";
			definition = "Set of elements used to reference the details of the original payment initiation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnderlyingPaymentInstruction1.mmObject();
		}
	};
	protected UnderlyingPaymentTransaction1 interbank;
	/**
	 * Set of elements used to reference the details of the original interbank
	 * payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1
	 * UnderlyingPaymentTransaction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice
	 * UnderlyingTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interbank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the original interbank payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterbank = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> UnderlyingTransaction1Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interbank";
			definition = "Set of elements used to reference the details of the original interbank payment transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnderlyingPaymentTransaction1.mmObject();
		}
	};
	protected UnderlyingStatementEntry1 statementEntry;
	/**
	 * Reference details on the underlying statement cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry1
	 * UnderlyingStatementEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice
	 * UnderlyingTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtNtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference details on the underlying statement cash entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatementEntry = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> UnderlyingTransaction1Choice.mmObject();
			isDerived = false;
			xmlTag = "StmtNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementEntry";
			definition = "Reference details on the underlying statement cash entry.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnderlyingStatementEntry1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UnderlyingTransaction1Choice.mmInitiation, UnderlyingTransaction1Choice.mmInterbank, UnderlyingTransaction1Choice.mmStatementEntry);
				messageBuildingBlock_lazy = () -> Arrays.asList(RequestToModifyPaymentV03.mmUnderlying, UnableToApplyV03.mmUnderlying, ClaimNonReceiptV03.mmUnderlying, AdditionalPaymentInformationV03.mmUnderlying,
						DebitAuthorisationRequestV03.mmUnderlying);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction1Choice";
				definition = "Specifies the details of the underlying transaction on which the investigation is processed.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Initn", required = true)
	public UnderlyingPaymentInstruction1 getInitiation() {
		return initiation;
	}

	public void setInitiation(UnderlyingPaymentInstruction1 initiation) {
		this.initiation = initiation;
	}

	@XmlElement(name = "IntrBk", required = true)
	public UnderlyingPaymentTransaction1 getInterbank() {
		return interbank;
	}

	public void setInterbank(UnderlyingPaymentTransaction1 interbank) {
		this.interbank = interbank;
	}

	@XmlElement(name = "StmtNtry", required = true)
	public UnderlyingStatementEntry1 getStatementEntry() {
		return statementEntry;
	}

	public void setStatementEntry(UnderlyingStatementEntry1 statementEntry) {
		this.statementEntry = statementEntry;
	}
}