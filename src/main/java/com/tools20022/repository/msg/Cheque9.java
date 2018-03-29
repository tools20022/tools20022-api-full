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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ChequeIssue;
import com.tools20022.repository.entity.CreditInstrument;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstitutionIdentification10;
import com.tools20022.repository.msg.PartyIdentification113;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics related to a cheque instruction, such as cheque type
 * or cheque number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque9#mmNumber
 * Cheque9.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque9#mmPayeeIdentification
 * Cheque9.mmPayeeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque9#mmDraweeIdentification
 * Cheque9.mmDraweeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque9#mmDrawerIdentification
 * Cheque9.mmDrawerIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ChequeIssue
 * ChequeIssue}</li>
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
 * "Cheque9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics related to a cheque instruction, such as cheque type or cheque number."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Cheque3 Cheque3}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Cheque9", propOrder = {"number", "payeeIdentification", "draweeIdentification", "drawerIdentification"})
public class Cheque9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nb")
	protected Max35Text number;
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
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmCreditInstrumentIdentification
	 * CreditInstrument.mmCreditInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque9
	 * Cheque9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a cheque as assigned by the financial institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cheque3#mmNumber
	 * Cheque3.mmNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque9, Optional<Max35Text>> mmNumber = new MMMessageAttribute<Cheque9, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> CreditInstrument.mmCreditInstrumentIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque9.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Unique and unambiguous identifier for a cheque as assigned by the financial institution.";
			previousVersion_lazy = () -> Cheque3.mmNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Cheque9 obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(Cheque9 obj, Optional<Max35Text> value) {
			obj.setNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "PyeeId", required = true)
	protected PartyIdentification113 payeeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque9
	 * Cheque9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyeeId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayeeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to which a cheque is made payable."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cheque3#mmPayeeIdentification
	 * Cheque3.mmPayeeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque9, PartyIdentification113> mmPayeeIdentification = new MMMessageAttribute<Cheque9, PartyIdentification113>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque9.mmObject();
			isDerived = false;
			xmlTag = "PyeeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayeeIdentification";
			definition = "Party to which a cheque is made payable.";
			previousVersion_lazy = () -> Cheque3.mmPayeeIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public PartyIdentification113 getValue(Cheque9 obj) {
			return obj.getPayeeIdentification();
		}

		@Override
		public void setValue(Cheque9 obj, PartyIdentification113 value) {
			obj.setPayeeIdentification(value);
		}
	};
	@XmlElement(name = "DrweeId")
	protected FinancialInstitutionIdentification10 draweeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10
	 * FinancialInstitutionIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque9
	 * Cheque9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrweeId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DraweeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution on which a cheque is drawn, that is, the financial institution that services the account of the entity that issued the cheque."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cheque3#mmDraweeIdentification
	 * Cheque3.mmDraweeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque9, Optional<FinancialInstitutionIdentification10>> mmDraweeIdentification = new MMMessageAttribute<Cheque9, Optional<FinancialInstitutionIdentification10>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque9.mmObject();
			isDerived = false;
			xmlTag = "DrweeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DraweeIdentification";
			definition = "Financial institution on which a cheque is drawn, that is, the financial institution that services the account of the entity that issued the cheque.";
			previousVersion_lazy = () -> Cheque3.mmDraweeIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstitutionIdentification10.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification10> getValue(Cheque9 obj) {
			return obj.getDraweeIdentification();
		}

		@Override
		public void setValue(Cheque9 obj, Optional<FinancialInstitutionIdentification10> value) {
			obj.setDraweeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DrwrId")
	protected PartyIdentification113 drawerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque9
	 * Cheque9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrwrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DrawerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owner that issues a cheque ordering the drawee bank to pay a specific amount, upon demand, to the payee."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cheque3#mmDrawerIdentification
	 * Cheque3.mmDrawerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque9, Optional<PartyIdentification113>> mmDrawerIdentification = new MMMessageAttribute<Cheque9, Optional<PartyIdentification113>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque9.mmObject();
			isDerived = false;
			xmlTag = "DrwrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DrawerIdentification";
			definition = "Account owner that issues a cheque ordering the drawee bank to pay a specific amount, upon demand, to the payee.";
			previousVersion_lazy = () -> Cheque3.mmDrawerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public Optional<PartyIdentification113> getValue(Cheque9 obj) {
			return obj.getDrawerIdentification();
		}

		@Override
		public void setValue(Cheque9 obj, Optional<PartyIdentification113> value) {
			obj.setDrawerIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque9.mmNumber, com.tools20022.repository.msg.Cheque9.mmPayeeIdentification, com.tools20022.repository.msg.Cheque9.mmDraweeIdentification,
						com.tools20022.repository.msg.Cheque9.mmDrawerIdentification);
				trace_lazy = () -> ChequeIssue.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cheque9";
				definition = "Set of characteristics related to a cheque instruction, such as cheque type or cheque number.";
				previousVersion_lazy = () -> Cheque3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getNumber() {
		return number == null ? Optional.empty() : Optional.of(number);
	}

	public Cheque9 setNumber(Max35Text number) {
		this.number = number;
		return this;
	}

	public PartyIdentification113 getPayeeIdentification() {
		return payeeIdentification;
	}

	public Cheque9 setPayeeIdentification(PartyIdentification113 payeeIdentification) {
		this.payeeIdentification = Objects.requireNonNull(payeeIdentification);
		return this;
	}

	public Optional<FinancialInstitutionIdentification10> getDraweeIdentification() {
		return draweeIdentification == null ? Optional.empty() : Optional.of(draweeIdentification);
	}

	public Cheque9 setDraweeIdentification(FinancialInstitutionIdentification10 draweeIdentification) {
		this.draweeIdentification = draweeIdentification;
		return this;
	}

	public Optional<PartyIdentification113> getDrawerIdentification() {
		return drawerIdentification == null ? Optional.empty() : Optional.of(drawerIdentification);
	}

	public Cheque9 setDrawerIdentification(PartyIdentification113 drawerIdentification) {
		this.drawerIdentification = drawerIdentification;
		return this;
	}
}