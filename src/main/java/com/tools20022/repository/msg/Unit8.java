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
import com.tools20022.repository.codeset.UKTaxGroupUnit1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OtherAmount1;
import com.tools20022.repository.msg.TotalFeesAndTaxes40;
import com.tools20022.repository.msg.UnitPrice23;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about units to transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmUnitsNumber
 * Unit8.mmUnitsNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmOrderDate
 * Unit8.mmOrderDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmAcquisitionDate
 * Unit8.mmAcquisitionDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmCertificateNumber
 * Unit8.mmCertificateNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmGroup1Or2Units
 * Unit8.mmGroup1Or2Units}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmReference
 * Unit8.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmPriceDetails
 * Unit8.mmPriceDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmTransactionOverhead
 * Unit8.mmTransactionOverhead}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmOtherAmount
 * Unit8.mmOtherAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
 * SecuritiesQuantity}</li>
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
 * "Unit8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about units to transfer."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Unit8", propOrder = {"unitsNumber", "orderDate", "acquisitionDate", "certificateNumber", "group1Or2Units", "reference", "priceDetails", "transactionOverhead", "otherAmount"})
public class Unit8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UnitsNb", required = true)
	protected DecimalNumber unitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit8
	 * Unit8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of units."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Unit8, DecimalNumber> mmUnitsNumber = new MMMessageAttribute<Unit8, DecimalNumber>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit8.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Quantity of units.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Unit8 obj) {
			return obj.getUnitsNumber();
		}

		@Override
		public void setValue(Unit8 obj, DecimalNumber value) {
			obj.setUnitsNumber(value);
		}
	};
	@XmlElement(name = "OrdrDt")
	protected ISODate orderDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderDate
	 * SecuritiesOrder.mmOrderDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit8
	 * Unit8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the investor or its agent placed the original order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Unit8, Optional<ISODate>> mmOrderDate = new MMMessageAttribute<Unit8, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit8.mmObject();
			isDerived = false;
			xmlTag = "OrdrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDate";
			definition = "Date the investor or its agent placed the original order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Unit8 obj) {
			return obj.getOrderDate();
		}

		@Override
		public void setValue(Unit8 obj, Optional<ISODate> value) {
			obj.setOrderDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AcqstnDt")
	protected ISODate acquisitionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmAcquisitionDate
	 * SecuritiesEntry.mmAcquisitionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit8
	 * Unit8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqstnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquisitionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the investor purchased the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Unit8, Optional<ISODate>> mmAcquisitionDate = new MMMessageAttribute<Unit8, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesEntry.mmAcquisitionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit8.mmObject();
			isDerived = false;
			xmlTag = "AcqstnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquisitionDate";
			definition = "Date the investor purchased the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Unit8 obj) {
			return obj.getAcquisitionDate();
		}

		@Override
		public void setValue(Unit8 obj, Optional<ISODate> value) {
			obj.setAcquisitionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CertNb")
	protected List<Max35Text> certificateNumber;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
	 * SecuritiesCertificate.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit8
	 * Unit8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate representing the security that is delivered."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Unit8, List<Max35Text>> mmCertificateNumber = new MMMessageAttribute<Unit8, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesCertificate.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit8.mmObject();
			isDerived = false;
			xmlTag = "CertNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			definition = "Certificate representing the security that is delivered.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(Unit8 obj) {
			return obj.getCertificateNumber();
		}

		@Override
		public void setValue(Unit8 obj, List<Max35Text> value) {
			obj.setCertificateNumber(value);
		}
	};
	@XmlElement(name = "Grp1Or2Units")
	protected UKTaxGroupUnit1Code group1Or2Units;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnit1Code
	 * UKTaxGroupUnit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmGroup1Or2Units
	 * SecuritiesQuantity.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit8
	 * Unit8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grp1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax group to which the purchased investment fund units belong. The investor indicates to the intermediary operating pooled nominees, which type of unit is to be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Unit8, Optional<UKTaxGroupUnit1Code>> mmGroup1Or2Units = new MMMessageAttribute<Unit8, Optional<UKTaxGroupUnit1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmGroup1Or2Units;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit8.mmObject();
			isDerived = false;
			xmlTag = "Grp1Or2Units";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group1Or2Units";
			definition = "Tax group to which the purchased investment fund units belong. The investor indicates to the intermediary operating pooled nominees, which type of unit is to be sold.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UKTaxGroupUnit1Code.mmObject();
		}

		@Override
		public Optional<UKTaxGroupUnit1Code> getValue(Unit8 obj) {
			return obj.getGroup1Or2Units();
		}

		@Override
		public void setValue(Unit8 obj, Optional<UKTaxGroupUnit1Code> value) {
			obj.setGroup1Or2Units(value.orElse(null));
		}
	};
	@XmlElement(name = "Ref")
	protected Max35Text reference;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit8
	 * Unit8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the units number. This may be the order reference of the original acquisition, the identification of a lot, a client reference, a sub-position reference or other related reference.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Unit8, Optional<Max35Text>> mmReference = new MMMessageAttribute<Unit8, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit8.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference to the units number. This may be the order reference of the original acquisition, the identification of a lot, a client reference, a sub-position reference or other related reference.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Unit8 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(Unit8 obj, Optional<Max35Text> value) {
			obj.setReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected UnitPrice23 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice23
	 * UnitPrice23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit8
	 * Unit8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the price. This may specify the price of original order confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Unit8, Optional<UnitPrice23>> mmPriceDetails = new MMMessageAssociationEnd<Unit8, Optional<UnitPrice23>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit8.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Information related to the price. This may specify the price of original order confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitPrice23.mmObject();
		}

		@Override
		public Optional<UnitPrice23> getValue(Unit8 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(Unit8 obj, Optional<UnitPrice23> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TxOvrhd")
	protected TotalFeesAndTaxes40 transactionOverhead;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
	 * TotalFeesAndTaxes40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit8
	 * Unit8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxOvrhd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOverhead"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fees and taxes. This may specify the fees and taxes related to the original order confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Unit8, Optional<TotalFeesAndTaxes40>> mmTransactionOverhead = new MMMessageAssociationEnd<Unit8, Optional<TotalFeesAndTaxes40>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit8.mmObject();
			isDerived = false;
			xmlTag = "TxOvrhd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOverhead";
			definition = "Fees and taxes. This may specify the fees and taxes related to the original order confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TotalFeesAndTaxes40.mmObject();
		}

		@Override
		public Optional<TotalFeesAndTaxes40> getValue(Unit8 obj) {
			return obj.getTransactionOverhead();
		}

		@Override
		public void setValue(Unit8 obj, Optional<TotalFeesAndTaxes40> value) {
			obj.setTransactionOverhead(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrAmt")
	protected List<OtherAmount1> otherAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherAmount1
	 * OtherAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAmount
	 * SecuritiesQuantity.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit8
	 * Unit8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amounts not covered in price, fee or tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Unit8, List<OtherAmount1>> mmOtherAmount = new MMMessageAssociationEnd<Unit8, List<OtherAmount1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit8.mmObject();
			isDerived = false;
			xmlTag = "OthrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmount";
			definition = "Amounts not covered in price, fee or tax.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherAmount1.mmObject();
		}

		@Override
		public List<OtherAmount1> getValue(Unit8 obj) {
			return obj.getOtherAmount();
		}

		@Override
		public void setValue(Unit8 obj, List<OtherAmount1> value) {
			obj.setOtherAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Unit8.mmUnitsNumber, com.tools20022.repository.msg.Unit8.mmOrderDate, com.tools20022.repository.msg.Unit8.mmAcquisitionDate,
						com.tools20022.repository.msg.Unit8.mmCertificateNumber, com.tools20022.repository.msg.Unit8.mmGroup1Or2Units, com.tools20022.repository.msg.Unit8.mmReference, com.tools20022.repository.msg.Unit8.mmPriceDetails,
						com.tools20022.repository.msg.Unit8.mmTransactionOverhead, com.tools20022.repository.msg.Unit8.mmOtherAmount);
				trace_lazy = () -> SecuritiesQuantity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Unit8";
				definition = "Information about units to transfer.";
			}
		});
		return mmObject_lazy.get();
	}

	public DecimalNumber getUnitsNumber() {
		return unitsNumber;
	}

	public Unit8 setUnitsNumber(DecimalNumber unitsNumber) {
		this.unitsNumber = Objects.requireNonNull(unitsNumber);
		return this;
	}

	public Optional<ISODate> getOrderDate() {
		return orderDate == null ? Optional.empty() : Optional.of(orderDate);
	}

	public Unit8 setOrderDate(ISODate orderDate) {
		this.orderDate = orderDate;
		return this;
	}

	public Optional<ISODate> getAcquisitionDate() {
		return acquisitionDate == null ? Optional.empty() : Optional.of(acquisitionDate);
	}

	public Unit8 setAcquisitionDate(ISODate acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
		return this;
	}

	public List<Max35Text> getCertificateNumber() {
		return certificateNumber == null ? certificateNumber = new ArrayList<>() : certificateNumber;
	}

	public Unit8 setCertificateNumber(List<Max35Text> certificateNumber) {
		this.certificateNumber = Objects.requireNonNull(certificateNumber);
		return this;
	}

	public Optional<UKTaxGroupUnit1Code> getGroup1Or2Units() {
		return group1Or2Units == null ? Optional.empty() : Optional.of(group1Or2Units);
	}

	public Unit8 setGroup1Or2Units(UKTaxGroupUnit1Code group1Or2Units) {
		this.group1Or2Units = group1Or2Units;
		return this;
	}

	public Optional<Max35Text> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public Unit8 setReference(Max35Text reference) {
		this.reference = reference;
		return this;
	}

	public Optional<UnitPrice23> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public Unit8 setPriceDetails(UnitPrice23 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}

	public Optional<TotalFeesAndTaxes40> getTransactionOverhead() {
		return transactionOverhead == null ? Optional.empty() : Optional.of(transactionOverhead);
	}

	public Unit8 setTransactionOverhead(TotalFeesAndTaxes40 transactionOverhead) {
		this.transactionOverhead = transactionOverhead;
		return this;
	}

	public List<OtherAmount1> getOtherAmount() {
		return otherAmount == null ? otherAmount = new ArrayList<>() : otherAmount;
	}

	public Unit8 setOtherAmount(List<OtherAmount1> otherAmount) {
		this.otherAmount = Objects.requireNonNull(otherAmount);
		return this;
	}
}