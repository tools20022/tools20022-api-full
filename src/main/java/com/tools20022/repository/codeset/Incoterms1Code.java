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
import com.tools20022.repository.codeset.Incoterms1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * A set of international standard trade terms (delivery terms) used to
 * designate a point at which the costs and risks of transport are divided
 * between the buyer and the seller.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Incoterms1Code#ExWorks
 * Incoterms1Code.ExWorks}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Incoterms1Code#FreeCarrier
 * Incoterms1Code.FreeCarrier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#FreeAlongsideShip
 * Incoterms1Code.FreeAlongsideShip}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Incoterms1Code#FreeOnBoard
 * Incoterms1Code.FreeOnBoard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#CostAndFreight
 * Incoterms1Code.CostAndFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#CostInsuranceAndFreight
 * Incoterms1Code.CostInsuranceAndFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#CarriagePaid
 * Incoterms1Code.CarriagePaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#CarriageAndInsurancePaid
 * Incoterms1Code.CarriageAndInsurancePaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#DeliveredAtFrontier
 * Incoterms1Code.DeliveredAtFrontier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#DeliveredExShip
 * Incoterms1Code.DeliveredExShip}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#DeliveredExQuay
 * Incoterms1Code.DeliveredExQuay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#DeliveredDutyUnpaid
 * Incoterms1Code.DeliveredDutyUnpaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#DeliveredDutyPaid
 * Incoterms1Code.DeliveredDutyPaid}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode IncotermsCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EXW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Incoterms1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A set of international standard trade terms (delivery terms) used to designate a point at which the costs and risks of transport are divided between the buyer and the seller."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Incoterms1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExWorks"</li>
	 * </ul>
	 */
	public static final Incoterms1Code ExWorks = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExWorks";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.ExWorks.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeCarrier"</li>
	 * </ul>
	 */
	public static final Incoterms1Code FreeCarrier = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeCarrier";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.FreeCarrier.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeAlongsideShip"</li>
	 * </ul>
	 */
	public static final Incoterms1Code FreeAlongsideShip = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeAlongsideShip";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.FreeAlongsideShip.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeOnBoard"</li>
	 * </ul>
	 */
	public static final Incoterms1Code FreeOnBoard = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeOnBoard";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.FreeOnBoard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostAndFreight"</li>
	 * </ul>
	 */
	public static final Incoterms1Code CostAndFreight = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CostAndFreight";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.CostAndFreight.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostInsuranceAndFreight"</li>
	 * </ul>
	 */
	public static final Incoterms1Code CostInsuranceAndFreight = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CostInsuranceAndFreight";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.CostInsuranceAndFreight.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarriagePaid"</li>
	 * </ul>
	 */
	public static final Incoterms1Code CarriagePaid = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarriagePaid";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.CarriagePaid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarriageAndInsurancePaid"</li>
	 * </ul>
	 */
	public static final Incoterms1Code CarriageAndInsurancePaid = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarriageAndInsurancePaid";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.CarriageAndInsurancePaid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredAtFrontier"</li>
	 * </ul>
	 */
	public static final Incoterms1Code DeliveredAtFrontier = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveredAtFrontier";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.DeliveredAtFrontier.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredExShip"</li>
	 * </ul>
	 */
	public static final Incoterms1Code DeliveredExShip = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveredExShip";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.DeliveredExShip.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredExQuay"</li>
	 * </ul>
	 */
	public static final Incoterms1Code DeliveredExQuay = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveredExQuay";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.DeliveredExQuay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredDutyUnpaid"</li>
	 * </ul>
	 */
	public static final Incoterms1Code DeliveredDutyUnpaid = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveredDutyUnpaid";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.DeliveredDutyUnpaid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredDutyPaid"</li>
	 * </ul>
	 */
	public static final Incoterms1Code DeliveredDutyPaid = new Incoterms1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveredDutyPaid";
			owner_lazy = () -> com.tools20022.repository.codeset.Incoterms1Code.mmObject();
			codeName = IncotermsCode.DeliveredDutyPaid.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Incoterms1Code> codesByName = new LinkedHashMap<>();

	protected Incoterms1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Incoterms1Code";
				definition = "A set of international standard trade terms (delivery terms) used to designate a point at which the costs and risks of transport are divided between the buyer and the seller.";
				trace_lazy = () -> IncotermsCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Incoterms1Code.ExWorks, com.tools20022.repository.codeset.Incoterms1Code.FreeCarrier, com.tools20022.repository.codeset.Incoterms1Code.FreeAlongsideShip,
						com.tools20022.repository.codeset.Incoterms1Code.FreeOnBoard, com.tools20022.repository.codeset.Incoterms1Code.CostAndFreight, com.tools20022.repository.codeset.Incoterms1Code.CostInsuranceAndFreight,
						com.tools20022.repository.codeset.Incoterms1Code.CarriagePaid, com.tools20022.repository.codeset.Incoterms1Code.CarriageAndInsurancePaid, com.tools20022.repository.codeset.Incoterms1Code.DeliveredAtFrontier,
						com.tools20022.repository.codeset.Incoterms1Code.DeliveredExShip, com.tools20022.repository.codeset.Incoterms1Code.DeliveredExQuay, com.tools20022.repository.codeset.Incoterms1Code.DeliveredDutyUnpaid,
						com.tools20022.repository.codeset.Incoterms1Code.DeliveredDutyPaid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ExWorks.getCodeName().get(), ExWorks);
		codesByName.put(FreeCarrier.getCodeName().get(), FreeCarrier);
		codesByName.put(FreeAlongsideShip.getCodeName().get(), FreeAlongsideShip);
		codesByName.put(FreeOnBoard.getCodeName().get(), FreeOnBoard);
		codesByName.put(CostAndFreight.getCodeName().get(), CostAndFreight);
		codesByName.put(CostInsuranceAndFreight.getCodeName().get(), CostInsuranceAndFreight);
		codesByName.put(CarriagePaid.getCodeName().get(), CarriagePaid);
		codesByName.put(CarriageAndInsurancePaid.getCodeName().get(), CarriageAndInsurancePaid);
		codesByName.put(DeliveredAtFrontier.getCodeName().get(), DeliveredAtFrontier);
		codesByName.put(DeliveredExShip.getCodeName().get(), DeliveredExShip);
		codesByName.put(DeliveredExQuay.getCodeName().get(), DeliveredExQuay);
		codesByName.put(DeliveredDutyUnpaid.getCodeName().get(), DeliveredDutyUnpaid);
		codesByName.put(DeliveredDutyPaid.getCodeName().get(), DeliveredDutyPaid);
	}

	public static Incoterms1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Incoterms1Code[] values() {
		Incoterms1Code[] values = new Incoterms1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Incoterms1Code> {
		@Override
		public Incoterms1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Incoterms1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}