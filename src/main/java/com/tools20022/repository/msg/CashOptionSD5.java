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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DTCCPayoutType1Code;
import com.tools20022.repository.codeset.WorkflowStatus1Code;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action option cash
 * movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD5#mmPlaceAndName
 * CashOptionSD5.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD5#mmPayoutNumber
 * CashOptionSD5.mmPayoutNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD5#mmPayoutType
 * CashOptionSD5.mmPayoutType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD5#mmPayoutStatus
 * CashOptionSD5.mmPayoutStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD5#mmMaximumWithholdingTaxPercentage
 * CashOptionSD5.mmMaximumWithholdingTaxPercentage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashOptionSD5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option cash movement details."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashOptionSD5", propOrder = {"placeAndName", "payoutNumber", "payoutType", "payoutStatus", "maximumWithholdingTaxPercentage"})
public class CashOptionSD5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD5 CashOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD5, Max350Text> mmPlaceAndName = new MMMessageAttribute<CashOptionSD5, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CashOptionSD5 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CashOptionSD5 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "PyoutNb", required = true)
	protected Exact3NumericText payoutNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD5 CashOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique number associated with a payout within an option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payout Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD5, Exact3NumericText> mmPayoutNumber = new MMMessageAttribute<CashOptionSD5, Exact3NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "PyoutNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutNumber";
			definition = "Unique number associated with a payout within an option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(CashOptionSD5 obj) {
			return obj.getPayoutNumber();
		}

		@Override
		public void setValue(CashOptionSD5 obj, Exact3NumericText value) {
			obj.setPayoutNumber(value);
		}
	};
	@XmlElement(name = "PyoutTp", required = true)
	protected DTCCPayoutType1Code payoutType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD5 CashOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the type of payout associated with the event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payout Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD5, DTCCPayoutType1Code> mmPayoutType = new MMMessageAttribute<CashOptionSD5, DTCCPayoutType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "PyoutTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutType";
			definition = "Describes the type of payout associated with the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCCPayoutType1Code.mmObject();
		}

		@Override
		public DTCCPayoutType1Code getValue(CashOptionSD5 obj) {
			return obj.getPayoutType();
		}

		@Override
		public void setValue(CashOptionSD5 obj, DTCCPayoutType1Code value) {
			obj.setPayoutType(value);
		}
	};
	@XmlElement(name = "PyoutSts", required = true)
	protected WorkflowStatus1Code payoutStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code
	 * WorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD5 CashOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Workflow status of the payout."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payout Status</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD5, WorkflowStatus1Code> mmPayoutStatus = new MMMessageAttribute<CashOptionSD5, WorkflowStatus1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "PyoutSts";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout Status"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutStatus";
			definition = "Workflow status of the payout.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WorkflowStatus1Code.mmObject();
		}

		@Override
		public WorkflowStatus1Code getValue(CashOptionSD5 obj) {
			return obj.getPayoutStatus();
		}

		@Override
		public void setValue(CashOptionSD5 obj, WorkflowStatus1Code value) {
			obj.setPayoutStatus(value);
		}
	};
	@XmlElement(name = "MaxWhldgTaxPctg")
	protected PercentageRate maximumWithholdingTaxPercentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD5 CashOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxWhldgTaxPctg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumWithholdingTaxPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum withholding rate based on the country of the sourced income."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Maximum Withholding Tax Percentage</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD5, Optional<PercentageRate>> mmMaximumWithholdingTaxPercentage = new MMMessageAttribute<CashOptionSD5, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "MaxWhldgTaxPctg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Maximum Withholding Tax Percentage"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumWithholdingTaxPercentage";
			definition = "Maximum withholding rate based on the country of the sourced income.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CashOptionSD5 obj) {
			return obj.getMaximumWithholdingTaxPercentage();
		}

		@Override
		public void setValue(CashOptionSD5 obj, Optional<PercentageRate> value) {
			obj.setMaximumWithholdingTaxPercentage(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOptionSD5.mmPlaceAndName, com.tools20022.repository.msg.CashOptionSD5.mmPayoutNumber, com.tools20022.repository.msg.CashOptionSD5.mmPayoutType,
						com.tools20022.repository.msg.CashOptionSD5.mmPayoutStatus, com.tools20022.repository.msg.CashOptionSD5.mmMaximumWithholdingTaxPercentage);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CashOptionSD5";
				definition = "Provides additional information regarding corporate action option cash movement details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CashOptionSD5 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Exact3NumericText getPayoutNumber() {
		return payoutNumber;
	}

	public CashOptionSD5 setPayoutNumber(Exact3NumericText payoutNumber) {
		this.payoutNumber = Objects.requireNonNull(payoutNumber);
		return this;
	}

	public DTCCPayoutType1Code getPayoutType() {
		return payoutType;
	}

	public CashOptionSD5 setPayoutType(DTCCPayoutType1Code payoutType) {
		this.payoutType = Objects.requireNonNull(payoutType);
		return this;
	}

	public WorkflowStatus1Code getPayoutStatus() {
		return payoutStatus;
	}

	public CashOptionSD5 setPayoutStatus(WorkflowStatus1Code payoutStatus) {
		this.payoutStatus = Objects.requireNonNull(payoutStatus);
		return this;
	}

	public Optional<PercentageRate> getMaximumWithholdingTaxPercentage() {
		return maximumWithholdingTaxPercentage == null ? Optional.empty() : Optional.of(maximumWithholdingTaxPercentage);
	}

	public CashOptionSD5 setMaximumWithholdingTaxPercentage(PercentageRate maximumWithholdingTaxPercentage) {
		this.maximumWithholdingTaxPercentage = maximumWithholdingTaxPercentage;
		return this;
	}
}