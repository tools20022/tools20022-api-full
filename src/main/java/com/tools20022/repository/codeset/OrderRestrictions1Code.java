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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OrderRestrictions1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the classification and thus the restrictions associated with an
 * order (for regulatory purposes).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#ProgramTrade
 * OrderRestrictions1Code.ProgramTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#IndexArbitrage
 * OrderRestrictions1Code.IndexArbitrage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#NonIndexArbitrage
 * OrderRestrictions1Code.NonIndexArbitrage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#CompetingMarketMaker
 * OrderRestrictions1Code.CompetingMarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#SpecialistInSecurity
 * OrderRestrictions1Code.SpecialistInSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#SpecialistInUnderlyingSecurity
 * OrderRestrictions1Code.SpecialistInUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#ForeignEntity
 * OrderRestrictions1Code.ForeignEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#ExternalMarketParticipant
 * OrderRestrictions1Code.ExternalMarketParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#ExternalInterConnectedMarketLinkage
 * OrderRestrictions1Code.ExternalInterConnectedMarketLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#RisklessArbitrage
 * OrderRestrictions1Code.RisklessArbitrage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
 * OrderClassificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PROG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderRestrictions1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the classification and thus the restrictions associated with an order (for regulatory purposes)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderRestrictions1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgramTrade"</li>
	 * </ul>
	 */
	public static final OrderRestrictions1Code ProgramTrade = new OrderRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgramTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderRestrictions1Code.mmObject();
			codeName = OrderClassificationCode.ProgramTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexArbitrage"</li>
	 * </ul>
	 */
	public static final OrderRestrictions1Code IndexArbitrage = new OrderRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexArbitrage";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderRestrictions1Code.mmObject();
			codeName = OrderClassificationCode.IndexArbitrage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonIndexArbitrage"</li>
	 * </ul>
	 */
	public static final OrderRestrictions1Code NonIndexArbitrage = new OrderRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonIndexArbitrage";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderRestrictions1Code.mmObject();
			codeName = OrderClassificationCode.NonIndexArbitrage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetingMarketMaker"</li>
	 * </ul>
	 */
	public static final OrderRestrictions1Code CompetingMarketMaker = new OrderRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetingMarketMaker";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderRestrictions1Code.mmObject();
			codeName = OrderClassificationCode.CompetingMarketMaker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialistInSecurity"</li>
	 * </ul>
	 */
	public static final OrderRestrictions1Code SpecialistInSecurity = new OrderRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialistInSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderRestrictions1Code.mmObject();
			codeName = OrderClassificationCode.SpecialistInSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialistInUnderlyingSecurity"</li>
	 * </ul>
	 */
	public static final OrderRestrictions1Code SpecialistInUnderlyingSecurity = new OrderRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialistInUnderlyingSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderRestrictions1Code.mmObject();
			codeName = OrderClassificationCode.SpecialistInUnderlyingSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignEntity"</li>
	 * </ul>
	 */
	public static final OrderRestrictions1Code ForeignEntity = new OrderRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignEntity";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderRestrictions1Code.mmObject();
			codeName = OrderClassificationCode.ForeignEntity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalMarketParticipant"</li>
	 * </ul>
	 */
	public static final OrderRestrictions1Code ExternalMarketParticipant = new OrderRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalMarketParticipant";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderRestrictions1Code.mmObject();
			codeName = OrderClassificationCode.ExternalMarketParticipant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalInterConnectedMarketLinkage"</li>
	 * </ul>
	 */
	public static final OrderRestrictions1Code ExternalInterConnectedMarketLinkage = new OrderRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalInterConnectedMarketLinkage";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderRestrictions1Code.mmObject();
			codeName = OrderClassificationCode.ExternalInterConnectedMarketLinkage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RisklessArbitrage"</li>
	 * </ul>
	 */
	public static final OrderRestrictions1Code RisklessArbitrage = new OrderRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RisklessArbitrage";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderRestrictions1Code.mmObject();
			codeName = OrderClassificationCode.RisklessArbitrage.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderRestrictions1Code> codesByName = new LinkedHashMap<>();

	protected OrderRestrictions1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PROG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderRestrictions1Code";
				definition = "Identifies the classification and thus the restrictions associated with an order (for regulatory purposes).";
				trace_lazy = () -> OrderClassificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderRestrictions1Code.ProgramTrade, com.tools20022.repository.codeset.OrderRestrictions1Code.IndexArbitrage,
						com.tools20022.repository.codeset.OrderRestrictions1Code.NonIndexArbitrage, com.tools20022.repository.codeset.OrderRestrictions1Code.CompetingMarketMaker,
						com.tools20022.repository.codeset.OrderRestrictions1Code.SpecialistInSecurity, com.tools20022.repository.codeset.OrderRestrictions1Code.SpecialistInUnderlyingSecurity,
						com.tools20022.repository.codeset.OrderRestrictions1Code.ForeignEntity, com.tools20022.repository.codeset.OrderRestrictions1Code.ExternalMarketParticipant,
						com.tools20022.repository.codeset.OrderRestrictions1Code.ExternalInterConnectedMarketLinkage, com.tools20022.repository.codeset.OrderRestrictions1Code.RisklessArbitrage);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ProgramTrade.getCodeName().get(), ProgramTrade);
		codesByName.put(IndexArbitrage.getCodeName().get(), IndexArbitrage);
		codesByName.put(NonIndexArbitrage.getCodeName().get(), NonIndexArbitrage);
		codesByName.put(CompetingMarketMaker.getCodeName().get(), CompetingMarketMaker);
		codesByName.put(SpecialistInSecurity.getCodeName().get(), SpecialistInSecurity);
		codesByName.put(SpecialistInUnderlyingSecurity.getCodeName().get(), SpecialistInUnderlyingSecurity);
		codesByName.put(ForeignEntity.getCodeName().get(), ForeignEntity);
		codesByName.put(ExternalMarketParticipant.getCodeName().get(), ExternalMarketParticipant);
		codesByName.put(ExternalInterConnectedMarketLinkage.getCodeName().get(), ExternalInterConnectedMarketLinkage);
		codesByName.put(RisklessArbitrage.getCodeName().get(), RisklessArbitrage);
	}

	public static OrderRestrictions1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderRestrictions1Code[] values() {
		OrderRestrictions1Code[] values = new OrderRestrictions1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderRestrictions1Code> {
		@Override
		public OrderRestrictions1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderRestrictions1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}