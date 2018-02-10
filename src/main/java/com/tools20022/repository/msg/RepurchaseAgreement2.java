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
import com.tools20022.repository.choice.RepurchaseAgreementType3Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.LEIIdentifier;
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
 * Agreement between two parties to sell a financial instrument or set of
 * financial instruments and repurchase at an agreed later date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2#mmMaturityDate
 * RepurchaseAgreement2.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2#mmSecondLegPrice
 * RepurchaseAgreement2.mmSecondLegPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2#mmCollateralMarketValue
 * RepurchaseAgreement2.mmCollateralMarketValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2#mmCounterparty
 * RepurchaseAgreement2.mmCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2#mmRepurchaseAgreementType
 * RepurchaseAgreement2.mmRepurchaseAgreementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2#mmTripartyAgentIdentification
 * RepurchaseAgreement2.mmTripartyAgentIdentification}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepurchaseAgreement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement between two parties to sell a financial instrument or set of financial instruments and repurchase at an agreed later date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RepurchaseAgreement3
 * RepurchaseAgreement3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Deposit1
 * Deposit1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RepurchaseAgreement2", propOrder = {"maturityDate", "secondLegPrice", "collateralMarketValue", "counterparty", "repurchaseAgreementType", "tripartyAgentIdentification"})
public class RepurchaseAgreement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MtrtyDt", required = true)
	protected ISODate maturityDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2
	 * RepurchaseAgreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the repurchase agreement matures."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Deposit1#mmMaturityDate
	 * Deposit1.mmMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreement2.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date on which the repurchase agreement matures.";
			previousVersion_lazy = () -> Deposit1.mmMaturityDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "ScndLegPric", required = true)
	protected ActiveCurrencyAndAmount secondLegPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2
	 * RepurchaseAgreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLegPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLegPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the repurchase price at maturity of the repo."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Deposit1#mmValue
	 * Deposit1.mmValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondLegPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreement2.mmObject();
			isDerived = false;
			xmlTag = "ScndLegPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLegPrice";
			definition = "Specifies the repurchase price at maturity of the repo.";
			previousVersion_lazy = () -> Deposit1.mmValue;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "CollMktVal", required = true)
	protected ActiveCurrencyAndAmount collateralMarketValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2
	 * RepurchaseAgreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollMktVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralMarketValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the dirty price of the underlying security or securities in repo."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralMarketValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreement2.mmObject();
			isDerived = false;
			xmlTag = "CollMktVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMarketValue";
			definition = "Specifies the dirty price of the underlying security or securities in repo.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "CtrPty", required = true)
	protected LEIIdentifier counterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2
	 * RepurchaseAgreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the counterparty to the repurchase agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Deposit1#mmCounterpartyIdentification
	 * Deposit1.mmCounterpartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterparty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreement2.mmObject();
			isDerived = false;
			xmlTag = "CtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterparty";
			definition = "Identifies the counterparty to the repurchase agreement.";
			previousVersion_lazy = () -> Deposit1.mmCounterpartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	@XmlElement(name = "RpAgrmtTp", required = true)
	protected RepurchaseAgreementType3Choice repurchaseAgreementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepurchaseAgreementType3Choice
	 * RepurchaseAgreementType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2
	 * RepurchaseAgreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpAgrmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of repurchase agreeement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement3#mmRepurchaseAgreementType
	 * RepurchaseAgreement3.mmRepurchaseAgreementType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepurchaseAgreementType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreement2.mmObject();
			isDerived = false;
			xmlTag = "RpAgrmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreementType";
			definition = "Specifies the type of repurchase agreeement.";
			nextVersions_lazy = () -> Arrays.asList(RepurchaseAgreement3.mmRepurchaseAgreementType);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RepurchaseAgreementType3Choice.mmObject();
		}
	};
	@XmlElement(name = "TrptyAgtId")
	protected LEIIdentifier tripartyAgentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2
	 * RepurchaseAgreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the triparty repurchase agent.\r\n"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement3#mmTripartyAgent
	 * RepurchaseAgreement3.mmTripartyAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTripartyAgentIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreement2.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentIdentification";
			definition = "Identifies the triparty repurchase agent.\r\n";
			nextVersions_lazy = () -> Arrays.asList(RepurchaseAgreement3.mmTripartyAgent);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RepurchaseAgreement2.mmMaturityDate, com.tools20022.repository.msg.RepurchaseAgreement2.mmSecondLegPrice,
						com.tools20022.repository.msg.RepurchaseAgreement2.mmCollateralMarketValue, com.tools20022.repository.msg.RepurchaseAgreement2.mmCounterparty,
						com.tools20022.repository.msg.RepurchaseAgreement2.mmRepurchaseAgreementType, com.tools20022.repository.msg.RepurchaseAgreement2.mmTripartyAgentIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RepurchaseAgreement2";
				definition = "Agreement between two parties to sell a financial instrument or set of financial instruments and repurchase at an agreed later date.";
				nextVersions_lazy = () -> Arrays.asList(RepurchaseAgreement3.mmObject());
				previousVersion_lazy = () -> Deposit1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public RepurchaseAgreement2 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = Objects.requireNonNull(maturityDate);
		return this;
	}

	public ActiveCurrencyAndAmount getSecondLegPrice() {
		return secondLegPrice;
	}

	public RepurchaseAgreement2 setSecondLegPrice(ActiveCurrencyAndAmount secondLegPrice) {
		this.secondLegPrice = Objects.requireNonNull(secondLegPrice);
		return this;
	}

	public ActiveCurrencyAndAmount getCollateralMarketValue() {
		return collateralMarketValue;
	}

	public RepurchaseAgreement2 setCollateralMarketValue(ActiveCurrencyAndAmount collateralMarketValue) {
		this.collateralMarketValue = Objects.requireNonNull(collateralMarketValue);
		return this;
	}

	public LEIIdentifier getCounterparty() {
		return counterparty;
	}

	public RepurchaseAgreement2 setCounterparty(LEIIdentifier counterparty) {
		this.counterparty = Objects.requireNonNull(counterparty);
		return this;
	}

	public RepurchaseAgreementType3Choice getRepurchaseAgreementType() {
		return repurchaseAgreementType;
	}

	public RepurchaseAgreement2 setRepurchaseAgreementType(RepurchaseAgreementType3Choice repurchaseAgreementType) {
		this.repurchaseAgreementType = Objects.requireNonNull(repurchaseAgreementType);
		return this;
	}

	public Optional<LEIIdentifier> getTripartyAgentIdentification() {
		return tripartyAgentIdentification == null ? Optional.empty() : Optional.of(tripartyAgentIdentification);
	}

	public RepurchaseAgreement2 setTripartyAgentIdentification(LEIIdentifier tripartyAgentIdentification) {
		this.tripartyAgentIdentification = tripartyAgentIdentification;
		return this;
	}
}