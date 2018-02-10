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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.Amount1Choice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Modification of an undertaking such as an guarantee or standby letter of
 * credit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AmendmentOfUndertaking"
 * src="doc-files/AmendmentOfUndertaking.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmDateOfIssuance
 * AmendmentOfUndertaking.mmDateOfIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmChangeOfAmount
 * AmendmentOfUndertaking.mmChangeOfAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmUndertaking
 * AmendmentOfUndertaking.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmBeneficiaryConsentRequestIndicator
 * AmendmentOfUndertaking.mmBeneficiaryConsentRequestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmAmendmentIdentification
 * AmendmentOfUndertaking.mmAmendmentIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmendment
 * Undertaking.mmUndertakingAmendment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentMessage1#mmUndertakingAmendmentDetails
 * UndertakingAmendmentMessage1.mmUndertakingAmendmentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment2#mmUndertakingAmendmentMessage
 * Amendment2.mmUndertakingAmendmentMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment6#mmUndertakingAmendmentMessage
 * Amendment6.mmUndertakingAmendmentMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentResponseMessage1#mmUndertakingAmendmentResponseDetails
 * UndertakingAmendmentResponseMessage1.mmUndertakingAmendmentResponseDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment9#mmUndertakingAmendmentResponseMessage
 * Amendment9.mmUndertakingAmendmentResponseMessage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment1 Amendment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingAmendmentMessage1
 * UndertakingAmendmentMessage1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment2 Amendment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment6 Amendment6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment3 Amendment3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment8 Amendment8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment7 Amendment7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentResponseMessage1
 * UndertakingAmendmentResponseMessage1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment9 Amendment9}</li>
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
 * "AmendmentOfUndertaking"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Modification of an undertaking such as an guarantee or standby letter of credit."
 * </li>
 * </ul>
 */
public class AmendmentOfUndertaking {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime dateOfIssuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#mmDateOfIssuance
	 * Amendment1.mmDateOfIssuance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the amendment is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDateOfIssuance = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Amendment1.mmDateOfIssuance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmendmentOfUndertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DateOfIssuance";
			definition = "Date the amendment is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmendmentOfUndertaking.class.getMethod("getDateOfIssuance", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount changeOfAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Amount1Choice#mmIncreaseAmount
	 * Amount1Choice.mmIncreaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Amount1Choice#mmDecreaseAmount
	 * Amount1Choice.mmDecreaseAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeOfAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Decrease (negative) or increase (positive) of the undertaking as a result of the amendment. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChangeOfAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Amount1Choice.mmIncreaseAmount, Amount1Choice.mmDecreaseAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmendmentOfUndertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChangeOfAmount";
			definition = "Decrease (negative) or increase (positive) of the undertaking as a result of the amendment. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmendmentOfUndertaking.class.getMethod("getChangeOfAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Undertaking undertaking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmendment
	 * Undertaking.mmUndertakingAmendment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#mmLocalUndertaking
	 * Amendment1.mmLocalUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment2#mmConfirmationDetails
	 * Amendment2.mmConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment3#mmUndertakingIdentification
	 * Amendment3.mmUndertakingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment3#mmCounterUndertaking
	 * Amendment3.mmCounterUndertaking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contents of an UndertakingAmendmentResponse message."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertaking = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Amendment1.mmLocalUndertaking, Amendment2.mmConfirmationDetails, Amendment3.mmUndertakingIdentification, Amendment3.mmCounterUndertaking);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmendmentOfUndertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Contents of an UndertakingAmendmentResponse message.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmUndertakingAmendment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	protected YesNoIndicator beneficiaryConsentRequestIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#mmBeneficiaryConsentRequestIndicator
	 * Amendment1.mmBeneficiaryConsentRequestIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryConsentRequestIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not a request for consent is required from the beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBeneficiaryConsentRequestIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Amendment1.mmBeneficiaryConsentRequestIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmendmentOfUndertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryConsentRequestIndicator";
			definition = "Indicates whether or not a request for consent is required from the beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmendmentOfUndertaking.class.getMethod("getBeneficiaryConsentRequestIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text amendmentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment8#mmIdentification
	 * Amendment8.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment7#mmAmendmentIdentification
	 * Amendment7.mmAmendmentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the amendment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmendmentIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Amendment8.mmIdentification, Amendment7.mmAmendmentIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmendmentOfUndertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmendmentIdentification";
			definition = "Identification of the amendment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmendmentOfUndertaking.class.getMethod("getAmendmentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmendmentOfUndertaking";
				definition = "Modification of an undertaking such as an guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.mmUndertakingAmendment);
				derivationElement_lazy = () -> Arrays.asList(UndertakingAmendmentMessage1.mmUndertakingAmendmentDetails, Amendment2.mmUndertakingAmendmentMessage, Amendment6.mmUndertakingAmendmentMessage,
						UndertakingAmendmentResponseMessage1.mmUndertakingAmendmentResponseDetails, Amendment9.mmUndertakingAmendmentResponseMessage);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmendmentOfUndertaking.mmDateOfIssuance, com.tools20022.repository.entity.AmendmentOfUndertaking.mmChangeOfAmount,
						com.tools20022.repository.entity.AmendmentOfUndertaking.mmUndertaking, com.tools20022.repository.entity.AmendmentOfUndertaking.mmBeneficiaryConsentRequestIndicator,
						com.tools20022.repository.entity.AmendmentOfUndertaking.mmAmendmentIdentification);
				derivationComponent_lazy = () -> Arrays.asList(Amendment1.mmObject(), UndertakingAmendmentMessage1.mmObject(), Amendment2.mmObject(), Amendment6.mmObject(), Amendment3.mmObject(), Amendment8.mmObject(),
						Amendment7.mmObject(), UndertakingAmendmentResponseMessage1.mmObject(), Amendment9.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AmendmentOfUndertaking.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getDateOfIssuance() {
		return dateOfIssuance;
	}

	public AmendmentOfUndertaking setDateOfIssuance(ISODateTime dateOfIssuance) {
		this.dateOfIssuance = Objects.requireNonNull(dateOfIssuance);
		return this;
	}

	public CurrencyAndAmount getChangeOfAmount() {
		return changeOfAmount;
	}

	public AmendmentOfUndertaking setChangeOfAmount(CurrencyAndAmount changeOfAmount) {
		this.changeOfAmount = Objects.requireNonNull(changeOfAmount);
		return this;
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public AmendmentOfUndertaking setUndertaking(com.tools20022.repository.entity.Undertaking undertaking) {
		this.undertaking = Objects.requireNonNull(undertaking);
		return this;
	}

	public YesNoIndicator getBeneficiaryConsentRequestIndicator() {
		return beneficiaryConsentRequestIndicator;
	}

	public AmendmentOfUndertaking setBeneficiaryConsentRequestIndicator(YesNoIndicator beneficiaryConsentRequestIndicator) {
		this.beneficiaryConsentRequestIndicator = Objects.requireNonNull(beneficiaryConsentRequestIndicator);
		return this;
	}

	public Max35Text getAmendmentIdentification() {
		return amendmentIdentification;
	}

	public AmendmentOfUndertaking setAmendmentIdentification(Max35Text amendmentIdentification) {
		this.amendmentIdentification = Objects.requireNonNull(amendmentIdentification);
		return this;
	}
}