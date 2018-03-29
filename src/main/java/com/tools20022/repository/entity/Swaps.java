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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.IssuerRole;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CreditDefaultSwapSingleName2;
import com.tools20022.repository.msg.SwapLegIdentification2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Derivative contract through which two parties exchange financial instruments.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Swaps" src="doc-files/Swaps.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Derivative
 * Derivative}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Swaps#mmSovereignIssuer
 * Swaps.mmSovereignIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Swaps#mmObligation
 * Swaps.mmObligation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CreditDefaultSwap
 * CreditDefaultSwap}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SwapLegIdentification2
 * SwapLegIdentification2}</li>
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
 * "Swaps"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Derivative contract through which two parties exchange financial instruments."
 * </li>
 * </ul>
 */
public class Swaps extends Derivative {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected IssuerRole sovereignIssuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.entity.IssuerRole
	 * IssuerRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2#mmSovereignIssuer
	 * CreditDefaultSwapSingleName2.mmSovereignIssuer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Swaps
	 * Swaps}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SovereignIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer is a national government within a given country."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Swaps, IssuerRole> mmSovereignIssuer = new MMBusinessAttribute<Swaps, IssuerRole>() {
		{
			derivation_lazy = () -> Arrays.asList(CreditDefaultSwapSingleName2.mmSovereignIssuer);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Swaps.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SovereignIssuer";
			definition = "Issuer is a national government within a given country.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IssuerRole.mmObject();
		}

		@Override
		public IssuerRole getValue(Swaps obj) {
			return obj.getSovereignIssuer();
		}

		@Override
		public void setValue(Swaps obj, IssuerRole value) {
			obj.setSovereignIssuer(value);
		}
	};
	protected Obligation obligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Swaps
	 * Swaps}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific underlying debt upon which a swap is based."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Swaps, com.tools20022.repository.entity.Obligation> mmObligation = new MMBusinessAttribute<Swaps, com.tools20022.repository.entity.Obligation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Swaps.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specific underlying debt upon which a swap is based.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Obligation getValue(Swaps obj) {
			return obj.getObligation();
		}

		@Override
		public void setValue(Swaps obj, com.tools20022.repository.entity.Obligation value) {
			obj.setObligation(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Swaps";
				definition = "Derivative contract through which two parties exchange financial instruments.";
				subType_lazy = () -> Arrays.asList(CreditDefaultSwap.mmObject());
				superType_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Swaps.mmSovereignIssuer, com.tools20022.repository.entity.Swaps.mmObligation);
				derivationComponent_lazy = () -> Arrays.asList(SwapLegIdentification2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Swaps.class;
			}
		});
		return mmObject_lazy.get();
	}

	public IssuerRole getSovereignIssuer() {
		return sovereignIssuer;
	}

	public Swaps setSovereignIssuer(IssuerRole sovereignIssuer) {
		this.sovereignIssuer = Objects.requireNonNull(sovereignIssuer);
		return this;
	}

	public Obligation getObligation() {
		return obligation;
	}

	public Swaps setObligation(com.tools20022.repository.entity.Obligation obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}
}