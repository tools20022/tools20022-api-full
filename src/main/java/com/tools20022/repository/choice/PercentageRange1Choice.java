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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FromToPercentageRange1;
import com.tools20022.repository.msg.PercentageRangeBoundary1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between ranges of rates in which a percentage rate is considered valid
 * or a specified percentage rate which has to be matched or unmatched to be
 * valid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PercentageRange1Choice#mmFrom
 * PercentageRange1Choice.mmFrom}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PercentageRange1Choice#mmTo
 * PercentageRange1Choice.mmTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PercentageRange1Choice#mmFromTo
 * PercentageRange1Choice.mmFromTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PercentageRange1Choice#mmEqual
 * PercentageRange1Choice.mmEqual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PercentageRange1Choice#mmNotEqual
 * PercentageRange1Choice.mmNotEqual}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PercentageRange1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between ranges of rates in which a percentage rate is considered valid or a specified percentage rate which has to be matched or unmatched to be valid."
 * </li>
 * </ul>
 */
public class PercentageRange1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRangeBoundary1 from;
	/**
	 * Lower boundary of a range of percentage rates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PercentageRangeBoundary1
	 * PercentageRangeBoundary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PercentageRange1Choice
	 * PercentageRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "From"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lower boundary of a range of percentage rates."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFrom = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PercentageRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "Fr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "Lower boundary of a range of percentage rates.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PercentageRangeBoundary1.mmObject();
		}
	};
	protected PercentageRangeBoundary1 to;
	/**
	 * Upper boundary of a range of percentage rates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PercentageRangeBoundary1
	 * PercentageRangeBoundary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PercentageRange1Choice
	 * PercentageRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "To"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "To"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Upper boundary of a range of percentage rates."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PercentageRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "To";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "To";
			definition = "Upper boundary of a range of percentage rates.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PercentageRangeBoundary1.mmObject();
		}
	};
	protected FromToPercentageRange1 fromTo;
	/**
	 * Range of valid percentage rates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FromToPercentageRange1
	 * FromToPercentageRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PercentageRange1Choice
	 * PercentageRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of valid percentage rates."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFromTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PercentageRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromTo";
			definition = "Range of valid percentage rates.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FromToPercentageRange1.mmObject();
		}
	};
	protected PercentageRate equal;
	/**
	 * Exact percentage rate must match to be considered valid.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.PercentageRange1Choice
	 * PercentageRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exact percentage rate must match to be considered valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEqual = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PercentageRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "EQ";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equal";
			definition = "Exact percentage rate must match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate notEqual;
	/**
	 * Value that percentage rate must not match to be considered valid.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.PercentageRange1Choice
	 * PercentageRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEqual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value that percentage rate must not match to be considered valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotEqual = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PercentageRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "NEQ";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEqual";
			definition = "Value that percentage rate must not match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PercentageRange1Choice.mmFrom, PercentageRange1Choice.mmTo, PercentageRange1Choice.mmFromTo, PercentageRange1Choice.mmEqual, PercentageRange1Choice.mmNotEqual);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PercentageRange1Choice";
				definition = "Choice between ranges of rates in which a percentage rate is considered valid or a specified percentage rate which has to be matched or unmatched to be valid.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRangeBoundary1 getFrom() {
		return from;
	}

	public void setFrom(PercentageRangeBoundary1 from) {
		this.from = from;
	}

	public PercentageRangeBoundary1 getTo() {
		return to;
	}

	public void setTo(PercentageRangeBoundary1 to) {
		this.to = to;
	}

	public FromToPercentageRange1 getFromTo() {
		return fromTo;
	}

	public void setFromTo(FromToPercentageRange1 fromTo) {
		this.fromTo = fromTo;
	}

	public PercentageRate getEqual() {
		return equal;
	}

	public void setEqual(PercentageRate equal) {
		this.equal = equal;
	}

	public PercentageRate getNotEqual() {
		return notEqual;
	}

	public void setNotEqual(PercentageRate notEqual) {
		this.notEqual = notEqual;
	}
}