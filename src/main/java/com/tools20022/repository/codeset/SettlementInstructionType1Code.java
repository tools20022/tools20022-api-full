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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SettlementInstructionType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies whether the movement on a securities account was the result of a
 * deliver or a receive instruction and whether the instruction was free or
 * against payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code#ReceiveFree
 * SettlementInstructionType1Code.ReceiveFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code#ReceiveAgainstPayment
 * SettlementInstructionType1Code.ReceiveAgainstPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code#DeliverFree
 * SettlementInstructionType1Code.DeliverFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code#DeliverAgainstPayment
 * SettlementInstructionType1Code.DeliverAgainstPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInstructionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies whether the movement on a securities account was the result of a deliver or a receive instruction and whether the instruction was free or against payment."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22H::REDE, ISO15022Synonym: :22H::PAYM</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RECE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementInstructionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The transaction is a receive free.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code
	 * SettlementInstructionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiveFree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The transaction is a receive free."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::REDE//RECE, ISO15022Synonym:
	 * :22H::PAYM//FREE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final SettlementInstructionType1Code ReceiveFree = new SettlementInstructionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::REDE//RECE"), new ISO15022Synonym(this, ":22H::PAYM//FREE"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ReceiveFree";
			definition = "The transaction is a receive free.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionType1Code.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * The transaction is a receive against payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code
	 * SettlementInstructionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVPA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiveAgainstPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The transaction is a receive against payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::REDE//RECE, ISO15022Synonym:
	 * :22H::PAYM//APMT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final SettlementInstructionType1Code ReceiveAgainstPayment = new SettlementInstructionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::REDE//RECE"), new ISO15022Synonym(this, ":22H::PAYM//APMT"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ReceiveAgainstPayment";
			definition = "The transaction is a receive against payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionType1Code.mmObject();
			codeName = "RVPA";
		}
	};
	/**
	 * The transaction is a deliver free.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code
	 * SettlementInstructionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverFree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The transaction is a deliver free."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::REDE//DELI, ISO15022Synonym:
	 * :22H::PAYM//FREE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final SettlementInstructionType1Code DeliverFree = new SettlementInstructionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::REDE//DELI"), new ISO15022Synonym(this, ":22H::PAYM//FREE"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "DeliverFree";
			definition = "The transaction is a deliver free.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionType1Code.mmObject();
			codeName = "DELI";
		}
	};
	/**
	 * The transaction is a deliver against payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code
	 * SettlementInstructionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVPA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverAgainstPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The transaction is a deliver against payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::REDE//DELI, ISO15022Synonym:
	 * :22H::PAYM//APMT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final SettlementInstructionType1Code DeliverAgainstPayment = new SettlementInstructionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::REDE//DELI"), new ISO15022Synonym(this, ":22H::PAYM//APMT"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "DeliverAgainstPayment";
			definition = "The transaction is a deliver against payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionType1Code.mmObject();
			codeName = "DVPA";
		}
	};
	final static private LinkedHashMap<String, SettlementInstructionType1Code> codesByName = new LinkedHashMap<>();

	protected SettlementInstructionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::REDE"), new ISO15022Synonym(this, ":22H::PAYM"));
				example = Arrays.asList("RECE");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "SettlementInstructionType1Code";
				definition = "Identifies whether the movement on a securities account was the result of a deliver or a receive instruction and whether the instruction was free or against payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementInstructionType1Code.ReceiveFree, com.tools20022.repository.codeset.SettlementInstructionType1Code.ReceiveAgainstPayment,
						com.tools20022.repository.codeset.SettlementInstructionType1Code.DeliverFree, com.tools20022.repository.codeset.SettlementInstructionType1Code.DeliverAgainstPayment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReceiveFree.getCodeName().get(), ReceiveFree);
		codesByName.put(ReceiveAgainstPayment.getCodeName().get(), ReceiveAgainstPayment);
		codesByName.put(DeliverFree.getCodeName().get(), DeliverFree);
		codesByName.put(DeliverAgainstPayment.getCodeName().get(), DeliverAgainstPayment);
	}

	public static SettlementInstructionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementInstructionType1Code[] values() {
		SettlementInstructionType1Code[] values = new SettlementInstructionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementInstructionType1Code> {
		@Override
		public SettlementInstructionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementInstructionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}