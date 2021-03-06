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
import com.tools20022.repository.msg.UnderlyingPaymentInstruction2;
import com.tools20022.repository.msg.UnderlyingPaymentTransaction2;
import com.tools20022.repository.msg.UnderlyingStatementEntry1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice#mmInitiation
 * UnderlyingTransaction2Choice.mmInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice#mmInterbank
 * UnderlyingTransaction2Choice.mmInterbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice#mmStatementEntry
 * UnderlyingTransaction2Choice.mmStatementEntry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#mmUnderlying
 * UnableToApplyV04.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04#mmUnderlying
 * ClaimNonReceiptV04.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV04#mmUnderlying
 * AdditionalPaymentInformationV04.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04#mmUnderlying
 * DebitAuthorisationRequestV04.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV01#mmUnderlying
 * RequestToModifyPaymentV01.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV05#mmUnderlying
 * AdditionalPaymentInformationV05.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV02#mmUnderlying
 * RequestToModifyPaymentV02.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV06#mmUnderlying
 * AdditionalPaymentInformationV06.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03#mmUnderlying
 * RequestToModifyPaymentV03.mmUnderlying}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingTransaction2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details of the underlying transaction on which the investigation is processed."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice
 * UnderlyingTransaction3Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingTransaction2Choice", propOrder = {"initiation", "interbank", "statementEntry"})
public class UnderlyingTransaction2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Initn", required = true)
	protected UnderlyingPaymentInstruction2 initiation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2
	 * UnderlyingPaymentInstruction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice
	 * UnderlyingTransaction2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Initn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the original payment initiation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#mmInitiation
	 * UnderlyingTransaction3Choice.mmInitiation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction2Choice, UnderlyingPaymentInstruction2> mmInitiation = new MMMessageAssociationEnd<UnderlyingTransaction2Choice, UnderlyingPaymentInstruction2>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.UnderlyingTransaction2Choice.mmObject();
			isDerived = false;
			xmlTag = "Initn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initiation";
			definition = "Set of elements used to reference the details of the original payment initiation.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction3Choice.mmInitiation);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnderlyingPaymentInstruction2.mmObject();
		}

		@Override
		public UnderlyingPaymentInstruction2 getValue(UnderlyingTransaction2Choice obj) {
			return obj.getInitiation();
		}

		@Override
		public void setValue(UnderlyingTransaction2Choice obj, UnderlyingPaymentInstruction2 value) {
			obj.setInitiation(value);
		}
	};
	@XmlElement(name = "IntrBk", required = true)
	protected UnderlyingPaymentTransaction2 interbank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2
	 * UnderlyingPaymentTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice
	 * UnderlyingTransaction2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interbank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the original interbank payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#mmInterbank
	 * UnderlyingTransaction3Choice.mmInterbank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction2Choice, UnderlyingPaymentTransaction2> mmInterbank = new MMMessageAssociationEnd<UnderlyingTransaction2Choice, UnderlyingPaymentTransaction2>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.UnderlyingTransaction2Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interbank";
			definition = "Set of elements used to reference the details of the original interbank payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction3Choice.mmInterbank);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnderlyingPaymentTransaction2.mmObject();
		}

		@Override
		public UnderlyingPaymentTransaction2 getValue(UnderlyingTransaction2Choice obj) {
			return obj.getInterbank();
		}

		@Override
		public void setValue(UnderlyingTransaction2Choice obj, UnderlyingPaymentTransaction2 value) {
			obj.setInterbank(value);
		}
	};
	@XmlElement(name = "StmtNtry", required = true)
	protected UnderlyingStatementEntry1 statementEntry;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice
	 * UnderlyingTransaction2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtNtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference details on the underlying statement cash entry."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#mmStatementEntry
	 * UnderlyingTransaction3Choice.mmStatementEntry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction2Choice, UnderlyingStatementEntry1> mmStatementEntry = new MMMessageAssociationEnd<UnderlyingTransaction2Choice, UnderlyingStatementEntry1>() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.UnderlyingTransaction2Choice.mmObject();
			isDerived = false;
			xmlTag = "StmtNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementEntry";
			definition = "Reference details on the underlying statement cash entry.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction3Choice.mmStatementEntry);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnderlyingStatementEntry1.mmObject();
		}

		@Override
		public UnderlyingStatementEntry1 getValue(UnderlyingTransaction2Choice obj) {
			return obj.getStatementEntry();
		}

		@Override
		public void setValue(UnderlyingTransaction2Choice obj, UnderlyingStatementEntry1 value) {
			obj.setStatementEntry(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UnderlyingTransaction2Choice.mmInitiation, com.tools20022.repository.choice.UnderlyingTransaction2Choice.mmInterbank,
						com.tools20022.repository.choice.UnderlyingTransaction2Choice.mmStatementEntry);
				messageBuildingBlock_lazy = () -> Arrays.asList(UnableToApplyV04.mmUnderlying, ClaimNonReceiptV04.mmUnderlying, AdditionalPaymentInformationV04.mmUnderlying, DebitAuthorisationRequestV04.mmUnderlying,
						RequestToModifyPaymentV01.mmUnderlying, AdditionalPaymentInformationV05.mmUnderlying, RequestToModifyPaymentV02.mmUnderlying, AdditionalPaymentInformationV06.mmUnderlying, RequestToModifyPaymentV03.mmUnderlying);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction2Choice";
				definition = "Specifies the details of the underlying transaction on which the investigation is processed.";
				nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public UnderlyingPaymentInstruction2 getInitiation() {
		return initiation;
	}

	public UnderlyingTransaction2Choice setInitiation(UnderlyingPaymentInstruction2 initiation) {
		this.initiation = Objects.requireNonNull(initiation);
		return this;
	}

	public UnderlyingPaymentTransaction2 getInterbank() {
		return interbank;
	}

	public UnderlyingTransaction2Choice setInterbank(UnderlyingPaymentTransaction2 interbank) {
		this.interbank = Objects.requireNonNull(interbank);
		return this;
	}

	public UnderlyingStatementEntry1 getStatementEntry() {
		return statementEntry;
	}

	public UnderlyingTransaction2Choice setStatementEntry(UnderlyingStatementEntry1 statementEntry) {
		this.statementEntry = Objects.requireNonNull(statementEntry);
		return this;
	}
}