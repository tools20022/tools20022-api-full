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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CreditSideTaxDebtor;
import com.tools20022.repository.entity.DebitSideTaxDebtor;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Details about tax paid, or to be paid, to the government in accordance with
 * the law, including pre-defined parameters such as thresholds and type of
 * account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmCreditor
 * TaxInformation4.mmCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmDebtor
 * TaxInformation4.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmUltimateDebtor
 * TaxInformation4.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmAdministrationZone
 * TaxInformation4.mmAdministrationZone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmReferenceNumber
 * TaxInformation4.mmReferenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmMethod
 * TaxInformation4.mmMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmTotalTaxableBaseAmount
 * TaxInformation4.mmTotalTaxableBaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmTotalTaxAmount
 * TaxInformation4.mmTotalTaxAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmDate
 * TaxInformation4.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmSequenceNumber
 * TaxInformation4.mmSequenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmRecord
 * TaxInformation4.mmRecord}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
 * "TaxInformation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details about tax paid, or to be paid, to the government in accordance with the law, including pre-defined parameters such as thresholds and type of account."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TaxInformation3
 * TaxInformation3}</li>
 * </ul>
 */
public class TaxInformation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TaxParty1 creditor;
	/**
	 * Party on the credit side of the transaction to which the tax applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxParty1 TaxParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditSideTaxDebtor
	 * CreditSideTaxDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party on the credit side of the transaction to which the tax applies."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmCreditor
	 * TaxInformation3.mmCreditor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditSideTaxDebtor.mmObject();
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party on the credit side of the transaction to which the tax applies.";
			previousVersion_lazy = () -> TaxInformation3.mmCreditor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxParty1.mmObject();
		}
	};
	protected TaxParty2 debtor;
	/**
	 * Identifies the party on the debit side of the transaction to which the
	 * tax applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxParty2 TaxParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitSideTaxDebtor
	 * DebitSideTaxDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party on the debit side of the transaction to which the tax applies."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmDebtor
	 * TaxInformation3.mmDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DebitSideTaxDebtor.mmObject();
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Identifies the party on the debit side of the transaction to which the tax applies.";
			previousVersion_lazy = () -> TaxInformation3.mmDebtor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxParty2.mmObject();
		}
	};
	protected TaxParty2 ultimateDebtor;
	/**
	 * Ultimate party that owes an amount of money to the (ultimate) creditor,
	 * in this case, to the taxing authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxParty2 TaxParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that owes an amount of money to the (ultimate) creditor, in this case, to the taxing authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUltimateDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor, in this case, to the taxing authority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxParty2.mmObject();
		}
	};
	protected Max35Text administrationZone;
	/**
	 * Territorial part of a country to which the tax payment is related.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAdministrationZone
	 * Tax.mmAdministrationZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdmstnZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdministrationZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Territorial part of a country to which the tax payment is related."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmAdministrationZone
	 * TaxInformation3.mmAdministrationZone}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdministrationZone = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAdministrationZone;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "AdmstnZone";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdministrationZone";
			definition = "Territorial part of a country to which the tax payment is related.";
			previousVersion_lazy = () -> TaxInformation3.mmAdministrationZone;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max140Text referenceNumber;
	/**
	 * Tax reference information that is specific to a taxing agency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmIdentification
	 * Tax.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax reference information that is specific to a taxing agency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmReferenceNumber
	 * TaxInformation3.mmReferenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmIdentification;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "RefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceNumber";
			definition = "Tax reference information that is specific to a taxing agency.";
			previousVersion_lazy = () -> TaxInformation3.mmReferenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max35Text method;
	/**
	 * Method used to indicate the underlying business or how the tax is paid.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmMethod Tax.mmMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to indicate the underlying business or how the tax is paid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmMethod
	 * TaxInformation3.mmMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmMethod;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Method used to indicate the underlying business or how the tax is paid.";
			previousVersion_lazy = () -> TaxInformation3.mmMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount totalTaxableBaseAmount;
	/**
	 * Total amount of money on which the tax is based.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableBaseAmount
	 * Tax.mmTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTaxblBaseAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTaxableBaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of money on which the tax is based."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmTotalTaxableBaseAmount
	 * TaxInformation3.mmTotalTaxableBaseAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalTaxableBaseAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxableBaseAmount;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "TtlTaxblBaseAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxableBaseAmount";
			definition = "Total amount of money on which the tax is based.";
			previousVersion_lazy = () -> TaxInformation3.mmTotalTaxableBaseAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount totalTaxAmount;
	/**
	 * Total amount of money as result of the calculation of the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money as result of the calculation of the tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmTotalTaxAmount
	 * TaxInformation3.mmTotalTaxAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "TtlTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxAmount";
			definition = "Total amount of money as result of the calculation of the tax.";
			previousVersion_lazy = () -> TaxInformation3.mmTotalTaxAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ISODate date;
	/**
	 * Date by which tax is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxDate Tax.mmTaxDate}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date by which tax is due."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmDate
	 * TaxInformation3.mmDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxDate;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date by which tax is due.";
			previousVersion_lazy = () -> TaxInformation3.mmDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Number sequenceNumber;
	/**
	 * Sequential number of the tax report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number of the tax report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmSequenceNumber
	 * TaxInformation3.mmSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Sequential number of the tax report.";
			previousVersion_lazy = () -> TaxInformation3.mmSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TaxRecord1> record;
	/**
	 * Record of tax details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxRecord1 TaxRecord1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Record"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of tax details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmRecord
	 * TaxInformation3.mmRecord}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecord = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRecord;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "Rcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Record";
			definition = "Record of tax details.";
			previousVersion_lazy = () -> TaxInformation3.mmRecord;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxRecord1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TaxInformation4.mmCreditor, TaxInformation4.mmDebtor, TaxInformation4.mmUltimateDebtor, TaxInformation4.mmAdministrationZone, TaxInformation4.mmReferenceNumber,
						TaxInformation4.mmMethod, TaxInformation4.mmTotalTaxableBaseAmount, TaxInformation4.mmTotalTaxAmount, TaxInformation4.mmDate, TaxInformation4.mmSequenceNumber, TaxInformation4.mmRecord);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxInformation4";
				definition = "Details about tax paid, or to be paid, to the government in accordance with the law, including pre-defined parameters such as thresholds and type of account.";
				previousVersion_lazy = () -> TaxInformation3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TaxParty1 getCreditor() {
		return creditor;
	}

	public void setCreditor(com.tools20022.repository.msg.TaxParty1 creditor) {
		this.creditor = creditor;
	}

	public TaxParty2 getDebtor() {
		return debtor;
	}

	public void setDebtor(com.tools20022.repository.msg.TaxParty2 debtor) {
		this.debtor = debtor;
	}

	public TaxParty2 getUltimateDebtor() {
		return ultimateDebtor;
	}

	public void setUltimateDebtor(com.tools20022.repository.msg.TaxParty2 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
	}

	public Max35Text getAdministrationZone() {
		return administrationZone;
	}

	public void setAdministrationZone(Max35Text administrationZone) {
		this.administrationZone = administrationZone;
	}

	public Max140Text getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(Max140Text referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Max35Text getMethod() {
		return method;
	}

	public void setMethod(Max35Text method) {
		this.method = method;
	}

	public ActiveOrHistoricCurrencyAndAmount getTotalTaxableBaseAmount() {
		return totalTaxableBaseAmount;
	}

	public void setTotalTaxableBaseAmount(ActiveOrHistoricCurrencyAndAmount totalTaxableBaseAmount) {
		this.totalTaxableBaseAmount = totalTaxableBaseAmount;
	}

	public ActiveOrHistoricCurrencyAndAmount getTotalTaxAmount() {
		return totalTaxAmount;
	}

	public void setTotalTaxAmount(ActiveOrHistoricCurrencyAndAmount totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}

	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}

	public Number getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Number sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public List<TaxRecord1> getRecord() {
		return record;
	}

	public void setRecord(List<com.tools20022.repository.msg.TaxRecord1> record) {
		this.record = record;
	}
}