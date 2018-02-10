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
import com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Firms that are taking in orders manually but routing for execution
 * electronically and for reporting to OATS must capture the client's handling
 * instructions.This is intended for compliance reporting only ( OATS Phase III
 * regulatory requirement).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#FillOrKill
 * CustomerHandlingInstructions1Code.FillOrKill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#ImmediateOrCancel
 * CustomerHandlingInstructions1Code.ImmediateOrCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#AllOrNone
 * CustomerHandlingInstructions1Code.AllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#Scale
 * CustomerHandlingInstructions1Code.Scale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#Work
 * CustomerHandlingInstructions1Code.Work}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#AddOnOrder
 * CustomerHandlingInstructions1Code.AddOnOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#ExchangeForPhysicalTransaction
 * CustomerHandlingInstructions1Code.ExchangeForPhysicalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#ImbalanceOnly
 * CustomerHandlingInstructions1Code.ImbalanceOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#Pegged
 * CustomerHandlingInstructions1Code.Pegged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#NotHeld
 * CustomerHandlingInstructions1Code.NotHeld}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
 * CustomerHandlingInstructionsCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FIKI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerHandlingInstructions1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Firms that are taking in orders manually but routing for execution electronically and for reporting to OATS must capture the client's handling instructions.This is intended for compliance reporting only ( OATS Phase III regulatory requirement)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CustomerHandlingInstructions1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FillOrKill"</li>
	 * </ul>
	 */
	public static final CustomerHandlingInstructions1Code FillOrKill = new CustomerHandlingInstructions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FillOrKill";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmObject();
			codeName = CustomerHandlingInstructionsCode.FillOrKill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImmediateOrCancel"</li>
	 * </ul>
	 */
	public static final CustomerHandlingInstructions1Code ImmediateOrCancel = new CustomerHandlingInstructions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImmediateOrCancel";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmObject();
			codeName = CustomerHandlingInstructionsCode.ImmediateOrCancel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * </ul>
	 */
	public static final CustomerHandlingInstructions1Code AllOrNone = new CustomerHandlingInstructions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmObject();
			codeName = CustomerHandlingInstructionsCode.AllOrNone.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scale"</li>
	 * </ul>
	 */
	public static final CustomerHandlingInstructions1Code Scale = new CustomerHandlingInstructions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scale";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmObject();
			codeName = CustomerHandlingInstructionsCode.Scale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Work"</li>
	 * </ul>
	 */
	public static final CustomerHandlingInstructions1Code Work = new CustomerHandlingInstructions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Work";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmObject();
			codeName = CustomerHandlingInstructionsCode.Work.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddOnOrder"</li>
	 * </ul>
	 */
	public static final CustomerHandlingInstructions1Code AddOnOrder = new CustomerHandlingInstructions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddOnOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmObject();
			codeName = CustomerHandlingInstructionsCode.AddOnOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForPhysicalTransaction"</li>
	 * </ul>
	 */
	public static final CustomerHandlingInstructions1Code ExchangeForPhysicalTransaction = new CustomerHandlingInstructions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForPhysicalTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmObject();
			codeName = CustomerHandlingInstructionsCode.ExchangeForPhysicalTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImbalanceOnly"</li>
	 * </ul>
	 */
	public static final CustomerHandlingInstructions1Code ImbalanceOnly = new CustomerHandlingInstructions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImbalanceOnly";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmObject();
			codeName = CustomerHandlingInstructionsCode.ImbalanceOnly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pegged"</li>
	 * </ul>
	 */
	public static final CustomerHandlingInstructions1Code Pegged = new CustomerHandlingInstructions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pegged";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmObject();
			codeName = CustomerHandlingInstructionsCode.Pegged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotHeld"</li>
	 * </ul>
	 */
	public static final CustomerHandlingInstructions1Code NotHeld = new CustomerHandlingInstructions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotHeld";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmObject();
			codeName = CustomerHandlingInstructionsCode.NotHeld.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CustomerHandlingInstructions1Code> codesByName = new LinkedHashMap<>();

	protected CustomerHandlingInstructions1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FIKI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerHandlingInstructions1Code";
				definition = "Firms that are taking in orders manually but routing for execution electronically and for reporting to OATS must capture the client's handling instructions.This is intended for compliance reporting only ( OATS Phase III regulatory requirement).";
				trace_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.FillOrKill, com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.ImmediateOrCancel,
						com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.AllOrNone, com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.Scale,
						com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.Work, com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.AddOnOrder,
						com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.ExchangeForPhysicalTransaction, com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.ImbalanceOnly,
						com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.Pegged, com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.NotHeld);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FillOrKill.getCodeName().get(), FillOrKill);
		codesByName.put(ImmediateOrCancel.getCodeName().get(), ImmediateOrCancel);
		codesByName.put(AllOrNone.getCodeName().get(), AllOrNone);
		codesByName.put(Scale.getCodeName().get(), Scale);
		codesByName.put(Work.getCodeName().get(), Work);
		codesByName.put(AddOnOrder.getCodeName().get(), AddOnOrder);
		codesByName.put(ExchangeForPhysicalTransaction.getCodeName().get(), ExchangeForPhysicalTransaction);
		codesByName.put(ImbalanceOnly.getCodeName().get(), ImbalanceOnly);
		codesByName.put(Pegged.getCodeName().get(), Pegged);
		codesByName.put(NotHeld.getCodeName().get(), NotHeld);
	}

	public static CustomerHandlingInstructions1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CustomerHandlingInstructions1Code[] values() {
		CustomerHandlingInstructions1Code[] values = new CustomerHandlingInstructions1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CustomerHandlingInstructions1Code> {
		@Override
		public CustomerHandlingInstructions1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CustomerHandlingInstructions1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}